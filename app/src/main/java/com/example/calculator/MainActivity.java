package com.example.calculator;

import
        androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.*;

public class MainActivity extends AppCompatActivity {
    Button sum,diff,div,mul,pow,per,button,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    EditText num1,num2;
    TextView t;
    Double n1,n2;

    public void add(View view)
    {
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());
        n1=n2+n1;
        Toast.makeText(MainActivity.this, "addition",Toast.LENGTH_SHORT).show();
        t.setText(Double.toString(n1));
        Intent intent = new Intent(getApplicationContext(),AnswerActivity.class);
        intent.putExtra("ANSWER",Double.toString(n1));
        startActivity(intent);

    }
    public void sub(View view)
    {
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());
        n1=n2-n1;
        Toast.makeText(MainActivity.this, "substraction",Toast.LENGTH_SHORT).show();
        t.setText(Double.toString(n1));
        Intent intent = new Intent(getApplicationContext(),AnswerActivity.class);
        intent.putExtra("ANSWER",Double.toString(n1));
        startActivity(intent);
    }
    public void mul(View view)
    {
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());
        n1=n2*n1;
        Toast.makeText(MainActivity.this, "multiplication",Toast.LENGTH_SHORT).show();
        t.setText(Double.toString(n1));
        Intent intent = new Intent(getApplicationContext(),AnswerActivity.class);
        intent.putExtra("ANSWER",Double.toString(n1));
        startActivity(intent);
    }
    public void div(View view)
    {
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());
        n1=n2/n1;
        Toast.makeText(MainActivity.this, "division",Toast.LENGTH_SHORT).show();
        t.setText(Double.toString(n1));
        Intent intent = new Intent(getApplicationContext(),AnswerActivity.class);
        intent.putExtra("ANSWER",Double.toString(n1));
        startActivity(intent);
    }
    public void pow(View view)
    {
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());
        double result=1;
        result=Math.pow(n1,n2);
        t.setText(Double.toString(result));
        Toast.makeText(MainActivity.this, "power",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),AnswerActivity.class);
        intent.putExtra("ANSWER",Double.toString(result));
        startActivity(intent);
    }
    public void per(View view)
    {
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());
        double result=1;
        result= (n1/n2)*100;
        t.setText(Double.toString(result));
        Toast.makeText(MainActivity.this, "percentage",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),AnswerActivity.class);
        intent.putExtra("ANSWER",Double.toString(n1));
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
sum=(Button) findViewById(R.id.add);
diff=(Button) findViewById(R.id.sub);
div=(Button) findViewById(R.id.div);
mul=(Button) findViewById(R.id.mul);
num1=(EditText) findViewById(R.id.editText);
num2=(EditText) findViewById(R.id.editText2);
pow = (Button) findViewById(R.id.pow);
per = (Button) findViewById(R.id.per);
t=(TextView) findViewById(R.id.textView3);
t=(TextView) findViewById(R.id.textView4);
t=(TextView) findViewById(R.id.textView5);
button=(Button) findViewById(R.id.button);
btn1=(Button) findViewById(R.id.btn1);
btn2=(Button) findViewById(R.id.btn2);
btn3=(Button) findViewById(R.id.btn3);
btn4=(Button) findViewById(R.id.btn4);
btn5=(Button) findViewById(R.id.btn5);
btn6=(Button) findViewById(R.id.btn6);
btn7=(Button) findViewById(R.id.btn7);
btn8=(Button) findViewById(R.id.btn8);
btn9=(Button) findViewById(R.id.btn9);
btn0=(Button) findViewById(R.id.btn0);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
     openActivity2();
    }
});
    }

    public void openActivity2()
    {
        Intent intent = new Intent(getApplicationContext(), Activity2.class);
        startActivity(intent);
    }
}
