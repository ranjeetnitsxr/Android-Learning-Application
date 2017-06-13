package com.example.android_demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

/**
 * Created by ranjeet on 9/6/17.
 */

public class CalenderViewClass extends Activity{

    CalendarView calendarView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calenderview);

        calendarView= (CalendarView) findViewById(R.id.calenderview_cv);
        calendarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CalenderViewClass.this, "calender view", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
