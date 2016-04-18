package com.example.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnPm(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Popular Movies app", Toast.LENGTH_SHORT).show();
    }

    public void btnSh(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Stock Hawk app", Toast.LENGTH_SHORT).show();
    }

    public void btnBib(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Build it Bigger app", Toast.LENGTH_SHORT).show();
    }

    public void btnMyam(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Make Your App Material app", Toast.LENGTH_SHORT).show();
    }

    public void btnGu(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Go Ubiquitous app", Toast.LENGTH_SHORT).show();
    }

    public void btnCap(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Capstone app", Toast.LENGTH_SHORT).show();
    }
}
