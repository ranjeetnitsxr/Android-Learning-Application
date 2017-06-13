package com.example.android_demo;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by ranjeet on 4/6/17.
 */

public class UserInterfaces extends ListActivity{
String components[]={"TextViewClass","ButtonClass","EditTextClass","listview","RadiogroupClass","CheckButton","ToggleButtonClass","Clock","ScrollViewClass","Spinner",
        "OptionMenuTest","ContextMenu","PopUpItem","DialogBox","ListDialog","DateandTimePicker","LayoutInflator"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(UserInterfaces.this,android.R.layout.simple_list_item_1,components));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        try
        {
            Class classForm=Class.forName("com.example.android_demo."+components[position]);
            startActivity(new Intent(this, classForm));
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
