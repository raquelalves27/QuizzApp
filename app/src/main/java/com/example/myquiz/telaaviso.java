package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class telaaviso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telaaviso);
    }
    public void ChamarMain(View v) {
        Intent telamain= new Intent(this, MainActivity.class);
        startActivity(telamain);
    }
}