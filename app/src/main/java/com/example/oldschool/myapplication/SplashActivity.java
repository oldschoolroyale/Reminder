package com.example.oldschool.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private ImageView mProfileImage;
    TextView splash_text, splash_text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mProfileImage = (ImageView) findViewById(R.id.materialup_profile_image);
        splash_text = (TextView)findViewById(R.id.splash_text);
        splash_text2 = (TextView)findViewById(R.id.junior);

        Animation anim = AnimationUtils.loadAnimation(this,R.anim.splash_anim);
        mProfileImage.startAnimation(anim);
        splash_text.startAnimation(anim);
        final Intent i = new Intent(this, MainActivity.class);
        Thread timer = new Thread(){
            public  void  run(){
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();

                }
            }
        };
        timer.start();
    }
    }

