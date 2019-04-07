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
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BiodataActivity extends AppCompatActivity {
    EditText isiNama, isiUmur;
    Button Nextbtn;

    private String KEY_NAME = "kamu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        isiNama = (EditText) findViewById(R.id.isinama);
        isiUmur = (EditText) findViewById(R.id.isiumur);
        Nextbtn = (Button) findViewById(R.id.Next);

        Nextbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String nama = isiNama.getText().toString();
                String umur = isiUmur.getText().toString();

                boolean isEmpty = false;

                if ((TextUtils.isEmpty(nama)) || (TextUtils.isEmpty(umur))){
                    isEmpty = true;
                    isiNama.setError("Data Wajib diisi");
                } else {
                    Intent next = new Intent(BiodataActivity.this, sayhiActivity.class);
                    next.putExtra(KEY_NAME, nama);
                    startActivity(next);
                }
            }
        });
    }
}
