package com.example.android_demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ranjeet on 13/6/17.
 */

public class UseOfBundle extends Activity implements View.OnClickListener{

    EditText name,email;
    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);

        name= (EditText) findViewById(R.id.bundle_et_name);
        email= (EditText) findViewById(R.id.bundle_et_email);
        button= (Button) findViewById(R.id.bundle_bt);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Bundle bundle=new Bundle();
        bundle.putString("name",name.getText().toString());
        bundle.putString("email",email.getText().toString());

        Intent intent=new Intent(UseOfBundle.this,BundleDescription.class);
        intent.putExtras(bundle);

        startActivity(intent);
    }
}
