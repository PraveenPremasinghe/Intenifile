package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btn;
    EditText number1,number2;
    String string1, string2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.fi1);
        number2 = findViewById(R.id.fi2);
        btn = findViewById(R.id.fokbtn);


    }
    protected void onResume() {
        super.onResume();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                string1 = number1.getText().toString();
                string2 = number2.getText().toString();



                intent.putExtra("NUM1",string1);
                intent.putExtra("NUM2",string2);
                startActivity(intent);



                Context context = getApplicationContext();
                CharSequence message = "you just clicked the ok buttons";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP| Gravity.LEFT,250,100);
                toast.show();
            }
        });
    }

}