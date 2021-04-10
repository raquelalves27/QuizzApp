package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class question03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question03);
    }
    public void Chamar01(View v) {
        Intent telaq01 = new Intent(this, medalhaBronze.class);
        startActivity(telaq01);
    }
    public void Chamar02(View v) {
        Intent telaq02 = new Intent(this, question04.class);
        startActivity(telaq02);
    }
}