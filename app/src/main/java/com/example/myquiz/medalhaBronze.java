package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class medalhaBronze extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medalha_bronze);
    }
    public void Chamarmain(View v) {
        Intent telaq01 =  new Intent(this, MainActivity.class);
        startActivity(telaq01);

    }
}