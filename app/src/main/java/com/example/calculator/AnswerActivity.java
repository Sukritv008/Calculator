package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
    TextView answerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer_activity);
        answerView = (TextView)findViewById(R.id.answerView);
        Intent intent= getIntent();
        String answer = intent.getStringExtra("ANSWER");
        answerView.setText(answer);
    }
}
