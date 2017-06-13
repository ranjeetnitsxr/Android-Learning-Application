package com.example.android_demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ranjeet on 9/6/17.
 */

public class EmailClass extends Activity implements View.OnClickListener{
    EditText name,email,title,message;
    TextView textView1,textView2,textView3,textView4;
    String namestr,emailstr,titlestr,messagestr,messageFormat;
    Button preview,send;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        name= (EditText) findViewById(R.id.Email_et_name);
        email= (EditText) findViewById(R.id.Email_et_email);
        title= (EditText) findViewById(R.id.Email_et_title);
        message= (EditText) findViewById(R.id.Email_et_message);
        textView1= (TextView) findViewById(R.id.Email_tv_email);
        textView2= (TextView) findViewById(R.id.Email_tv_name);
        textView3= (TextView) findViewById(R.id.Email_tv_email);
        textView4= (TextView) findViewById(R.id.Email_tv_message);
        preview= (Button) findViewById(R.id.Email_bt_preview);
        send= (Button) findViewById(R.id.Email_bt_send);



        preview.setOnClickListener(this);
        send.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        namestr=name.getText().toString();
        emailstr=email.getText().toString();
        titlestr=title.getText().toString();
        messagestr=message.getText().toString();

        messageFormat="Hii,"+namestr+" i am going to talk about "+titlestr+" that "+messagestr;

        if (v.getId() == R.id.Email_bt_preview)
        {
            message.setText(messageFormat);
        }
        else if (v.getId() == R.id.Email_bt_send)
        {
            String emailAddress[]={emailstr};

            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.setData(Uri.parse("mailto:"));
            emailIntent.setType("plain/text");

            emailIntent.putExtra(Intent.EXTRA_EMAIL,emailAddress);
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"I LOVE YOU");
            emailIntent.putExtra(Intent.EXTRA_TEXT,messageFormat);

            startActivity(Intent.createChooser(emailIntent,"sending mail...."));
        }
    }

}
