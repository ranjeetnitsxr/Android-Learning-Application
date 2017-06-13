package com.example.android_demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.AnalogClock;
import android.widget.DigitalClock;

/**
 * Created by ranjeet on 7/6/17.
 */

public class Clock extends Activity{
    DigitalClock digitalClock;
    AnalogClock analogClock;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);
        digitalClock= (DigitalClock) findViewById(R.id.Clock_digital);
        analogClock= (AnalogClock) findViewById(R.id.Clock_analog);
    }
}
