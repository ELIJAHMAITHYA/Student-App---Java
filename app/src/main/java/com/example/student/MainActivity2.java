package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Integer x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        if (intent != null) {
            String NetIncome = intent.getStringExtra("netIncome");
            String Output = "netIncome = " + NetIncome;
            Toast.makeText(getApplicationContext(), Output, Toast.LENGTH_LONG).show();

        }

    }
}