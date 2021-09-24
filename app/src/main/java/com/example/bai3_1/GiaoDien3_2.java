package com.example.bai3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class GiaoDien3_2 extends AppCompatActivity {
    ImageView imageview,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_dien32);
        imageview = findViewById(R.id.imageView4);
        imageView2= findViewById(R.id.imageView2);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

        imageview.setOnClickListener(view->{
            Intent intent = new Intent(GiaoDien3_2.this,GiaoDien3_3.class);
            ActivityOptionsCompat options =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(GiaoDien3_2.this,imageview,
                            ViewCompat.getTransitionName(imageview));
            startActivity(intent,options.toBundle());
        });

        Fade fade1 = new Fade();
        View decor1 = getWindow().getDecorView();

        getWindow().setEnterTransition(fade1);
        getWindow().setExitTransition(fade1);

        imageView2.setOnClickListener(view->{
            Intent intent = new Intent(GiaoDien3_2.this,GiaoDien3_4.class);
            ActivityOptionsCompat options =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(GiaoDien3_2.this,imageView2,
                            ViewCompat.getTransitionName(imageView2));
            startActivity(intent,options.toBundle());
        });
    }
}