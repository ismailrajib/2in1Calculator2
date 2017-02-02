package com.example.mohammedismail.a2in1calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LocalCalculator extends AppCompatActivity {
    Button sum,sub,mul,div;
    EditText etext1,etext2;
    TextView txtresult;
    public float num1 = 0, num2 = 0, result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_calculator);
        etext1=(EditText)findViewById(R.id.etxt1);
        etext2=(EditText)findViewById(R.id.etxt2);

        sum=(Button)findViewById(R.id.plus);
        sub=(Button)findViewById(R.id.minus);
        mul=(Button)findViewById(R.id.into);
        div=(Button)findViewById(R.id.divide);
        txtresult=(TextView)findViewById(R.id.result);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                result= num1+num2;
                txtresult.setText( num1 +"+"+num2+"="+result);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                result= num1-num2;
                txtresult.setText( num1 +"-"+num2+"="+result);

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                result= num1*num2;
                txtresult.setText( num1 +"*"+num2+"="+result);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                result= num1/num2;
                txtresult.setText( num1 +"/"+num2+"="+result);

            }
        });
    }
    public void numberInput()

    {   //cheking number field empty or not
        if (TextUtils.isEmpty(etext1.getText().toString())||TextUtils.isEmpty((etext2.getText().toString())))
        {
            return;
        }
        else {   //parse string value to float value
            num1 = Float.parseFloat(etext1.getText().toString());
            num2 = Float.parseFloat(etext2.getText().toString());
    }
}}
