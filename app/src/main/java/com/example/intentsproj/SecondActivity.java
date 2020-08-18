package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText number3,number4;
    String string1,string2;
    Button addbtn1,minbtn2,mulbtn3,divbtn4;
    float result;
    int Num1,Num2;
    String operator;
    TextView printn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        number3 = findViewById(R.id.si1);
        number4 = findViewById(R.id.si2);
        addbtn1 = findViewById(R.id.add1);
        minbtn2 = findViewById(R.id.min2);
        mulbtn3 = findViewById(R.id.mul3);
        divbtn4 = findViewById(R.id.div4);
        printn  =  findViewById(R.id.answer);

        string1=(getIntent().getStringExtra("NUM1"));
        string2=(getIntent().getStringExtra("NUM2"));

        number3.setText(string1);
        number4.setText(string2);

        addbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Num1 = Integer.parseInt(number3.getText().toString());
                Num2 = Integer.parseInt(number4.getText().toString());
                operator = "+";
                result = Num1+Num2;
                printn.setText(number3.getText().toString()+ " " + operator +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }

        });
        minbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Num1 = Integer.parseInt(number3.getText().toString());
                Num2 = Integer.parseInt(number4.getText().toString());
                operator = "-";
                result = Num1-Num2;
                printn.setText(number3.getText().toString()+ " " + operator +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }

        });
        mulbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Num1 = Integer.parseInt(number3.getText().toString());
                Num2 = Integer.parseInt(number4.getText().toString());
                operator = "*";
                result = Num1*Num2;
                printn.setText(number3.getText().toString()+ " " + operator +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }

        });
        divbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Num1 = Integer.parseInt(number3.getText().toString());
                Num2 = Integer.parseInt(number4.getText().toString());
                operator = "/";
                result = Num1/Num2;
                printn.setText(number3.getText().toString()+ " " + operator +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }

        });

    }
}