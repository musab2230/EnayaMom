package com.andro.enaya_mom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class home extends AppCompatActivity  {
TextView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        user=findViewById(R.id.user);

    }

    public void babyies(View view) {
        Intent i= new Intent(home.this,baby.class);
        startActivity(i);

    }




    public void moms(View view) {
        Intent i= new Intent(home.this,baby.class);
        startActivity(i);
    }

    public void open_camera(View view) {
        Intent camera =getPackageManager().getLaunchIntentForPackage("com.macrovideo.v380pro");
        if (camera!=null)
        {startActivity(camera);}
        else
        {
            Toast.makeText(home.this,"عذرا لا يمكن تشغيل الكاميرا!",Toast.LENGTH_LONG).show();
        }
    }
}