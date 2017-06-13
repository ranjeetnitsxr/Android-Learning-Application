package com.example.android_demo;

import android.app.Activity;
import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class wallpaper extends Activity
{
    Button button1,button2;
    ImageView imageView;
    WallpaperManager wallpaperManager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        button1= (Button) findViewById(R.id.wallpaper_bt1);
        button2= (Button) findViewById(R.id.wallpaper_bt2);
        imageView= (ImageView) findViewById(R.id.wallpaper_iv);

        wallpaperManager=WallpaperManager.getInstance(getApplicationContext());

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                try
                {
                    imageView.setImageResource(R.drawable.boy);
                    wallpaperManager.setResource(R.drawable.boy);
                    //wallpaperManager.setBitmap(bitmap);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
    public void setWallpaper(View view)
    {
        try
        {
            imageView.setImageResource(R.drawable.ganesh_lord);
            wallpaperManager.setResource(R.drawable.ganesh_lord);
            //wallpaperManager.setBitmap(bitmap);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}