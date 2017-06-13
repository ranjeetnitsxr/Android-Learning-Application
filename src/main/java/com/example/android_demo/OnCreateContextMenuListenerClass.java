package com.example.android_demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by ranjeet on 9/6/17.
 */

public class OnCreateContextMenuListenerClass extends Activity implements View.OnCreateContextMenuListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createcontextmenu);
    }
}
