package com.gcet.perfect.imaze19;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SplashActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        try {
            videoView = (VideoView) findViewById(R.id.splashVideo);

            Uri path = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.spalshvideo);

            videoView.setVideoURI(path);
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    jump();
                }
            });

            videoView.start();
        }catch (Exception e){
            jump();
        }



    }

    private void jump() {
        if (isFinishing())
            return;
        startActivity(new Intent(SplashActivity.this,MainActivity.class));
    }


}
