package com.example.android_demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ranjeet on 9/6/17.
 */

public class OnClickLisenerClass extends Activity implements View.OnClickListener{

    TextView textView;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onclicklistener);
        textView = (TextView) findViewById(R.id.onclicklisenerclass_tv);
        button = (Button) findViewById(R.id.onclicklisenerclass_bt);
        editText = (EditText) findViewById(R.id.onclicklisenerclass_et);

        textView.setOnClickListener(this);
        button.setOnClickListener(this);
        editText.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.onclicklisenerclass_tv:
                Toast.makeText(OnClickLisenerClass.this, "textview", Toast.LENGTH_SHORT).show();

                break;
            case R.id.onclicklisenerclass_bt:
                Toast.makeText(OnClickLisenerClass.this, "button", Toast.LENGTH_SHORT).show();

                break;
            case R.id.onclicklisenerclass_et:
                Toast.makeText(OnClickLisenerClass.this, "edittext", Toast.LENGTH_SHORT).show();

                break;


        }
    }
}
