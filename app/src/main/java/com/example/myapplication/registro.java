package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void onClick (View view){

        Intent miInten=new Intent(registro.this,menuapp.class);
        startActivity(miInten);
    }

    public void onClick2 (View view){

        Intent miInten=new Intent(registro.this,MainActivity.class);
        startActivity(miInten);
    }

}