package com.example.android_demo;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * Created by ranjeet on 7/6/17.
 */

public class ImplementClasses extends ListActivity
{
String arr[]={"OnClickLisenerClass","OnCreateContextMenuListenerClass","OnApplyWindowInsetsListenerClass","OnAttachStateChangeListenerClass",
        "OnContextClickListenerClass","OnDragListenerClass","OnFocusChangeListenerClass","OnGenericMotionListenerClass",
        "OnHoverListenerClass","OnKeyListenerClass","OnLayoutChangeListenerClass","OnLongClickListenerClass","OnScrollChangeListenerClass",
        "OnSystemUiVisibilityChangeListenerClass","OnTouchListener","AccessibilityDelegate","BaseSavedState","DragShadowBuilder","MeasureSpec"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_implementclasses);

        setListAdapter(new ArrayAdapter<String>(ImplementClasses.this,android.R.layout.simple_list_item_1,arr));
        }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);


        try
        {
           Class classForm = Class.forName("com.example.android_demo."+arr[position]);
            startActivity(new Intent(this,classForm));
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
