package com.example.myquiz;

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
    public void Chamar01(View v) {
        Intent telaq01 =  new Intent(this, instrucoes.class);
        startActivity(telaq01);

    }
    public void Chamaraviso(View v) {
        Intent telaviso =  new Intent(this, telaaviso.class);
        startActivity(telaviso);

    }
}