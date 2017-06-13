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
 * Created by ranjeet on 7/6/17.
 */

public class ImplementClasses extends Activity implements View.OnClickListener
{

    TextView textView;
    Button button;
    EditText editText;
    CalendarView calendarView;
    RatingBar ratingBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implementclasses);

        textView= (TextView) findViewById(R.id.implementClasses_tv);
        button= (Button) findViewById(R.id.implementClasses_bt);
        editText= (EditText) findViewById(R.id.implementClasses_et);
        calendarView= (CalendarView) findViewById(R.id.implementClasses_cv);
        ratingBar= (RatingBar) findViewById(R.id.implementClasses_rbar);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.implementClasses_tv:
                editText.setText("textview pressed");
                Toast.makeText(this,"textview pressed",Toast.LENGTH_SHORT).show();
            break;
            case R.id.implementClasses_bt:
                editText.setText("button pressed");
                Toast.makeText(this,"Button Pressed",Toast.LENGTH_SHORT).show();
                break;
            case R.id.implementClasses_et:
                editText.setText("editext pressed");
                Toast.makeText(this,"edittext pressed",Toast.LENGTH_SHORT).show();
                break;
            case R.id.implementClasses_cv:
                editText.setText("calender view is pressed");
                Toast.makeText(this,"calederview is pressed",Toast.LENGTH_SHORT).show();
                break;
            case R.id.implementClasses_rbar:
                editText.setText("rating bar is pressed");
                Toast.makeText(this,"rating bar is pressed",Toast.LENGTH_SHORT).show();
        }
    }
    public void method(View view)
    {
        editText.setText("textview pressed");
        Toast.makeText(this,"textview pressed",Toast.LENGTH_SHORT).show();


    }
}
