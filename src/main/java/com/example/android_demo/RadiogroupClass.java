package com.example.android_demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by ranjeet on 7/6/17.
 */

public class RadiogroupClass extends Activity implements RadioGroup.OnCheckedChangeListener{

    TextView print;
    RadioGroup radioGroup_linear,radioGroup_vertical;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiogroup);

        radioGroup_linear= (RadioGroup) findViewById(R.id.radiogroup_rg1);
        radioGroup_vertical= (RadioGroup) findViewById(R.id.radiogroup_rg2);
        print= (TextView) findViewById(R.id.radiogroup_tv);

        radioGroup_linear.setOnCheckedChangeListener(this);
        radioGroup_vertical.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        if(group.getId()==R.id.radiogroup_rg1) {
            switch (checkedId)
            {
                case R.id.radiogroup_male:
                    print.setText("you are male \n");
                    break;
                case R.id.radiogroup_female:
                    print.setText("you are female \n");
                    break;
                case R.id.radiogroup_transgender:
                    print.setText("you are transgender");

            }
        }
        else
        {
            switch(checkedId)
            {
                case R.id.radiogroup_easy:
                    print.setText("easy mode selected  \n ");
                    break;
                case R.id.radiogroup_medium:
                    print.setText("medium mode selected \n");
                    break;
                case R.id.radiogroup_hard:
                    print.setText("hard mode selected \n");
                    break;
                case R.id.radiogroup_advance:
                    print.setText("advance mode selected \n");
                    break;
                case R.id.radiogroup_pro:
                    print.setText("pro mode selected \n");
            }
        }
    }
}
