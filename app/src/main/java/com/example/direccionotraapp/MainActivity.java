package com.example.direccionotraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton fb, ins, tw, cam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fb= findViewById(R.id.buttonFacebook);
        ins = findViewById(R.id.buttonInstagram);
        tw= findViewById(R.id.buttonTwitter);
        cam = findViewById(R.id.buttonCamara);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebook = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(facebook);
            }
        });
        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebook = getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                startActivity(facebook);
            }
        });
        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebook = getPackageManager().getLaunchIntentForPackage("com.twitter.android");
                startActivity(facebook);
            }
        });
        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebook = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(facebook);
            }
        });
    }
}