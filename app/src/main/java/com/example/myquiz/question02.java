package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class question02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question02);
    }
    public void Chamarparti(View v) {
        Intent telapar =  new Intent(this, participacao.class);
        startActivity(telapar);

    }
    public void Chamar02(View v) {
        Intent telaq02 = new Intent(this, question03.class);
        startActivity(telaq02);
    }
}