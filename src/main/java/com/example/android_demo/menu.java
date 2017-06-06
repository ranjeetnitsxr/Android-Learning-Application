package com.example.android_demo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by ranjeet on 3/6/17.
 */

public class menu extends ListActivity {
String classes[]={"UserInterfaces","RandomVariable","Activity1","activity2","Activity3","activity4","Activity5","activity6","Activity7","activity8"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setListAdapter(new ArrayAdapter<String>(menu.this,android.R.layout.simple_list_item_1,classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);


        try
        {
            Class classForm=Class.forName("com.example.android_demo."+classes[position]);
            startActivity(new Intent(this, classForm));
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

}
