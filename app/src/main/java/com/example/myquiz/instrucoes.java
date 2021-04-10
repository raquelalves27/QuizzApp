package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class instrucoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucoes);
    }
    public void Chamar01(View v) {
        Intent telaq01 =  new Intent(this, question01.class);
        startActivity(telaq01);

    }
}