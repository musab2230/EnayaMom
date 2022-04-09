package com.andro.enaya_mom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class sign_up extends AppCompatActivity {
Button sign_up;
EditText name,password,repassword;
    private DatabaseReference root;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        sign_up=findViewById(R.id.sign_up);
        name=findViewById(R.id.name);
        password=findViewById(R.id.password);
        repassword=findViewById(R.id.repassword);
        root = FirebaseDatabase.getInstance().getReference().child(name.getText().toString());

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
root.push().setValue(name.getText().toString());
root.push().setValue(password.getText().toString());
root.push().setValue(repassword.getText().toString());
                //Intent i = new Intent(sign_up.this,signed_up.class);
                //startActivity(i);
            }
        });
    }
}