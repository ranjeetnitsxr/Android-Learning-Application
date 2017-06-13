package com.example.android_demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by ranjeet on 14/6/17.
 */

public class BundleDescription extends Activity {
    String name,email;
    Bundle bundle;
    TextView  textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_description);

        bundle=getIntent().getExtras();

        name=bundle.getString("name");
        email=bundle.getString("email");

        textView.setText("hello,"+name+"\n your email is "+email);
    }
}
