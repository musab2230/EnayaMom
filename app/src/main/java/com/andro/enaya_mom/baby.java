package com.andro.enaya_mom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class baby extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby);


}

    public void open_camera(View view) {
        Intent camera =getPackageManager().getLaunchIntentForPackage("com.macrovideo.v380pro");
        if (camera!=null)
        {startActivity(camera);}
        else
        {
            Toast.makeText(baby.this,"عذرا لا يمكن تشغيل الكاميرا!",Toast.LENGTH_LONG).show();
        }
    }
    }