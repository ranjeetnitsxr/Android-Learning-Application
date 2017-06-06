package com.example.android_demo;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;


/**
 * Created by ranjeet on 3/6/17.
 */

public class splash  extends Activity {
    MediaPlayer mediaPlayer;
       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        mediaPlayer=MediaPlayer.create(this,R.raw.ringtone);
        mediaPlayer.start();
        Thread t = new Thread()       //anonymous class
        {
            public void run() {
                try {
                        sleep(5000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                } finally {
                    startActivity(new Intent(splash.this,menu.class));
                }
            }
        };
        t.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.release();
    }
}