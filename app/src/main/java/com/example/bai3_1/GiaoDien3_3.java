package com.example.bai3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.time.Instant;

public class GiaoDien3_3 extends AppCompatActivity {
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_dien33);
        btnBack = findViewById(R.id.btn_Back1);

        btnBack.setOnClickListener(view->{
            Intent intent = new Intent(GiaoDien3_3.this,GiaoDien3_2.class);
            startActivity(intent);
        });
    }
}