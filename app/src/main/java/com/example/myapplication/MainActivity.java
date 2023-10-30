package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick (View view){

        Intent miInten=new Intent(MainActivity.this,menuapp.class);
        startActivity(miInten);
    }

    public void onClick2 (View view){

        Intent miInten=new Intent(MainActivity.this,registro.class);
        startActivity(miInten);
    }

}