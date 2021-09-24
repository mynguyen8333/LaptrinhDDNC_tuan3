package com.example.bai3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGo = findViewById(R.id.btnGo);
        btnGo.setOnClickListener(view->{
            startActivity(new Intent(MainActivity.this,GiaoDien3_2.class));
            overridePendingTransition(R.anim.enter,R.anim.exit);
        });

    }
}