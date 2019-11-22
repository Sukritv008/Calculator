package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class Activity2 extends AppCompatActivity {
    Button sinhBtn,coshBtn,tanhBtn,sinBtn,cosBtn,tanBtn,sqrtBtn;
    TextView answer;
    EditText inputNum1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        sinhBtn = (Button) findViewById(R.id.sinhBtn);
        coshBtn = (Button) findViewById(R.id.coshBtn);
        tanhBtn = (Button) findViewById(R.id.tanhBtn);
        sinBtn = (Button) findViewById(R.id.sinBtn);
        cosBtn = (Button) findViewById(R.id.cosBtn);
        tanBtn = (Button) findViewById(R.id.tanBtn);
        answer = (TextView) findViewById(R.id.answer);
        inputNum1 = (EditText)findViewById(R.id.inputNum1);
        sqrtBtn = (Button) findViewById(R.id.sqrtBtn);
        sqrtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number = Double.parseDouble(inputNum1.getText().toString());
                double squareRoot = Math.sqrt(number);
                answer.setText("Answer is =  "+squareRoot);
                Intent intent = new Intent(getApplicationContext(),AnswerActivity.class);
                intent.putExtra("ANSWER",Double.toString(squareRoot));
                startActivity(intent);
            }
        });
        tanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valueRadian = Double.parseDouble(inputNum1.getText().toString());
                double tangentValue = Math.tan(valueRadian);
                answer.setText("Answer is "+tangentValue);
                Intent intent = new Intent(getApplicationContext(),AnswerActivity.class);
                intent.putExtra("ANSWER",Double.toString(tangentValue));
                startActivity(intent);
            }
        });
        cosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valueRadian = Double.parseDouble(inputNum1.getText().toString());
                double cosineValue = Math.cos(valueRadian);
                answer.setText("Answer is "+cosineValue);
                Intent intent = new Intent(getApplicationContext(),AnswerActivity.class);
                intent.putExtra("ANSWER",Double.toString(cosineValue));
                startActivity(intent);
            }
        });
        sinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valueRadian = Double.parseDouble(inputNum1.getText().toString());
                double sineValue = Math.sin(valueRadian);
                answer.setText("Answer is "+sineValue);
                Intent intent = new Intent(getApplicationContext(),AnswerActivity.class);
                intent.putExtra("ANSWER",Double.toString(sineValue));
                startActivity(intent);
            }
        });
        tanhBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = Double.parseDouble(inputNum1.getText().toString());
                double tanhValue = Math.tanh(value);
                answer.setText("Answer is "+tanhValue);
                Intent intent = new Intent(getApplicationContext(),AnswerActivity.class);
                intent.putExtra("ANSWER",Double.toString(tanhValue));
                startActivity(intent);
            }
        });
        coshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = Double.parseDouble(inputNum1.getText().toString());
                double cosineValue = Math.cosh(value);
                answer.setText("Answer is "+cosineValue);
                Intent intent = new Intent(getApplicationContext(),AnswerActivity.class);
                intent.putExtra("ANSWER",Double.toString(cosineValue));
                startActivity(intent);
            }
        });
        sinhBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = Double.parseDouble(inputNum1.getText().toString());
                double sineValue = Math.sinh(value);
                answer.setText("Answer is "+sineValue);
                Intent intent = new Intent(getApplicationContext(),AnswerActivity.class);
                intent.putExtra("ANSWER",Double.toString(sineValue));
                startActivity(intent);
            }
        });
    }
}
