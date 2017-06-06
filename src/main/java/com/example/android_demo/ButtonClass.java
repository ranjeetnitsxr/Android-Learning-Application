package com.example.android_demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by ranjeet on 4/6/17.
 */

public class ButtonClass extends Activity{
    Button b1,b2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        b1= (Button) findViewById(R.id.Button_bt1);
        b2= (Button) findViewById(R.id.Button_bt2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonClass.this,"listener invoked",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void callbymethod(View view)
    {
        Toast.makeText(ButtonClass.this,"method invoked",Toast.LENGTH_SHORT).show();
    }

}
