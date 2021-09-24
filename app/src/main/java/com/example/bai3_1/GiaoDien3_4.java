package com.example.bai3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class GiaoDien3_4 extends AppCompatActivity {
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_dien34);
        btnBack = findViewById(R.id.btnBack2);
        btnBack.setOnClickListener(view->{
            Intent intent = new Intent(GiaoDien3_4.this,GiaoDien3_2.class);
            startActivity(intent);
        });
    }
}