package com.example.android_demo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Random;

/**
 * Created by ranjeet on 4/6/17.
 */

public class ToggleButtonClass extends Activity {
    ToggleButton toggleButton;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togglebutton);
        toggleButton= (ToggleButton) findViewById(R.id.ToggleButton_tb1);
        linearLayout= (LinearLayout) findViewById(R.id.ToggleButton_layout);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toggleButton.isChecked())
                    linearLayout.setBackgroundColor(Color.GREEN);
                else {
                    Random random=new Random();
                    linearLayout.setBackgroundColor(Color.rgb(random.nextInt(265),random.nextInt(265),random.nextInt(265)));
                }
            }
        });
    }
    }
