package com.example.android_demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * Created by ranjeet on 7/6/17.
 */

public class ScrollViewClass extends Activity {
    HorizontalScrollView horizontalScrollView;
    ScrollView scrollView;
    LinearLayout linearLayout1,linearLayout2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollview);

        horizontalScrollView= (HorizontalScrollView) findViewById(R.id.scrollViewClass_hsv);
        scrollView= (ScrollView) findViewById(R.id.scrollViewClass_sv);
        linearLayout1= (LinearLayout) findViewById(R.id.scrollViewClass_ll1);
        linearLayout2= (LinearLayout) findViewById(R.id.scrollViewClass_ll2);

    }
}
