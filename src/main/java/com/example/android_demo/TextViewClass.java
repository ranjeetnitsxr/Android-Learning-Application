package com.example.android_demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by ranjeet on 4/6/17.
 */

public class TextViewClass extends Activity {
    TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);

        tv1= (TextView) findViewById(R.id.textview_tv1);
        tv2= (TextView) findViewById(R.id.textview_tv2);
        tv3= (TextView) findViewById(R.id.textview_tv3);
    }
}
