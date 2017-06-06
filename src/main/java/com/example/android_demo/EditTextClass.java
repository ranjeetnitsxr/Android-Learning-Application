package com.example.android_demo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by ranjeet on 4/6/17.
 */

public class EditTextClass extends Activity{
    EditText et1;
    Button bt1,bt2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext);

        et1= (EditText) findViewById(R.id.Edittext_et1);
        bt1= (Button) findViewById(R.id.Edittext_bt1);
        bt2= (Button) findViewById(R.id.Edittext_bt2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no=Integer.parseInt(et1.getText().toString());
                no++;
                et1.setBackgroundColor(Color.DKGRAY);
                et1.setText(""+no);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no=Integer.parseInt(et1.getText().toString());
                no--;
                et1.setBackgroundColor(Color.GRAY);
                et1.setText(""+no);
            }
        });
    }

}
