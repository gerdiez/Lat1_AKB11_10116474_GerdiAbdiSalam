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

public class MainActivity extends AppCompatActivity {
    Button mulaibtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mulaibtn = (Button) findViewById(R.id.btnMulai);
        mulaibtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this,loginActivity.class);
                startActivity(i);
            }
        });
    }
}
