package com.example.android_demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * Created by ranjeet on 9/6/17.
 */

public class RatingBarClass extends Activity {
    RatingBar ratingBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingbar);

        ratingBar= (RatingBar) findViewById(R.id.ratingbar_rbar);

        ratingBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RatingBarClass.this, "rating bar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
