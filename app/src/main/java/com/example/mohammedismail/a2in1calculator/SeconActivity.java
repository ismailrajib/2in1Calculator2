package com.example.mohammedismail.a2in1calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SeconActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secon);
        btn1=(Button)findViewById(R.id.calc);
        btn2=(Button)findViewById(R.id.cgpa);
        btn3=(Button)findViewById(R.id.abtme);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SeconActivity.this,LocalCalculator.class);
                startActivity(intent);
                Toast.makeText(SeconActivity.this, "Calculator", Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SeconActivity.this,CGPACalculator.class);
                startActivity(intent);
                Toast.makeText(SeconActivity.this, "CGPA Calculator", Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SeconActivity.this,AboutMe.class);
                startActivity(intent);
                Toast.makeText(SeconActivity.this, "Creator Detail", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
