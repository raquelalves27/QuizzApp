package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class participacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participacao);
    }
    public void Chamarmain(View v) {
        Intent telaq02 = new Intent(this, instrucoes.class);
        startActivity(telaq02);
    }
}