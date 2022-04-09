package com.andro.enaya_mom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread=new Thread(){
            @Override
            public void run() {
                super.run();

                try {
                    Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.alpha);
                    logo.startAnimation(animation);
                    name.startAnimation(animation);
                    sleep(5000);

                    Intent t=new Intent(MainActivity.this,home.class);

                    startActivity(t);
                }

                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };thread.start();

        Intent r = new Intent(MainActivity.this,sign_up.class);
        startActivity(r);
    }
    }
