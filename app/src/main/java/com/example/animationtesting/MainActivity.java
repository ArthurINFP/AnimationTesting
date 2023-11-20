package com.example.animationtesting;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
//        ImageView imageView = findViewById(R.id.iv_animation);
////        imageView.setImageDrawable(R.drawable.animation_list);
//        animationDrawable = (AnimationDrawable) imageView.getDrawable();
//        imageView.post(run);
    }

//    Runnable run = new Runnable() {
//        @Override
//        public void run() {
//            animationDrawable.start();
//        }
//    };
}