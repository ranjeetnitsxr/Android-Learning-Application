package com.example.android_demo;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;


/**
 * Created by ranjeet on 10/6/17.
 */

public class CameraClass extends Activity implements View.OnClickListener{
    ImageView imageView;
    ImageButton imageButton;
    Button image,video;
    Intent cameraIntent;
    int cameraActivity_returning_Data=0;
    Bitmap bitmap;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        imageButton= (ImageButton) findViewById(R.id.camera_ib);
        imageView= (ImageView) findViewById(R.id.camera_iv);
        image= (Button) findViewById(R.id.camera_bt);
        video= (Button) findViewById(R.id.camera_bt2);

        imageButton.setOnClickListener(this);
        image.setOnClickListener(this);
        video.setOnClickListener(this);

        InputStream inputStream=getResources().openRawResource(R.drawable.girl);
        bitmap= BitmapFactory.decodeStream(inputStream);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.camera_bt:
                cameraIntent=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent,cameraActivity_returning_Data);//getting a result from an activity i.e.image is taken form the cameraIntent Activity.

                break;
            case R.id.camera_bt2:
                cameraIntent=new Intent(android.provider.MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(cameraIntent,cameraActivity_returning_Data);

                break;
            case R.id.camera_ib:
                //pemission added in manifest.xml and set wallpaper manager here
                WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
                try
                {
                    wallpaperManager.setBitmap(bitmap);

                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                break;
        }
    }
    //receiving acivity result
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==cameraActivity_returning_Data)
        {
            if (resultCode == RESULT_OK)//check that operation is succesful returning data by an intent
            {
                Bundle extras = data.getExtras();           //bundle is a set of data used to passing data between various activities
                bitmap = (Bitmap) extras.get("data");       //bitmap defines a display space and the color for each pixels in the dispaly space
                imageView.setImageBitmap(bitmap);           //setting that pixel information on the imageview
            }

        }
    }
}
