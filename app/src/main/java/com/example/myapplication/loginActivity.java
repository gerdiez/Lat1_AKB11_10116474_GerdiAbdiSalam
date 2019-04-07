/*
 * NIM   : 10116474
 * NAMA  : Gerdi Abdi Salam
 * KELAS : AKB-11
 * TGL   : 05/04/2019
 * */

package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginActivity extends AppCompatActivity {
    Button btnnext;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);
        btnnext = (Button) findViewById(R.id.masuk);
        btnnext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(loginActivity.this, BiodataActivity.class);
                startActivity(i);
            }
        });
    }
}
