package com.example.project2java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnloginMurid = findViewById(R.id.btn_logmurid);
        Button btnloginGuru = findViewById(R.id.btn_logguru);

        btnloginGuru.setOnClickListener(this);
        btnloginMurid.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_logguru){
            Intent intent = new Intent(this, MainPageGuru.class);
            startActivity(intent);
        }

        else if(v.getId() == R.id.btn_logmurid){
            Intent intent = new Intent(this, MainPageMurid.class);
            startActivity(intent);
        }
    }
}