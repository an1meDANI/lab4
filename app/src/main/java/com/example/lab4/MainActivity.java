package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("MissingPermission")
    public void btn_click(View view) {
        Intent intent = new Intent(MainActivity.this, moorning.class);
        startActivity(intent);
    }

    public void btn_click2(View view) {
        Intent intent = new Intent(MainActivity.this, day.class);
        startActivity(intent);
    }

    public void btn_click3(View view) {
        Intent intent = new Intent(MainActivity.this, evening.class);
        startActivity(intent);
    }

    public void btn_click4(View view) {
        Intent intent = new Intent(MainActivity.this, night.class);
        startActivity(intent);
    }
}