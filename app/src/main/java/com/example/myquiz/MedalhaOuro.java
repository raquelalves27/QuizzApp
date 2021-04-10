package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MedalhaOuro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medalha_ouro);
    }
    public void ChamarMain(View v) {
        Intent telamain= new Intent(this, MainActivity.class);
        startActivity(telamain);
    }
}