package com.example.mohammedismail.a2in1calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CGPACalculator extends AppCompatActivity {
    EditText etxtc1,etxtc2;
    Button btnc1;
    TextView txtcv;
    public float num1 = 0, num2 = 0, resultcgpaset = 0,multi,add,total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpacalculator);
        etxtc1=(EditText)findViewById(R.id.cetxt1);
        etxtc2=(EditText)findViewById(R.id.cetxt2);

        btnc1=(Button)findViewById(R.id.button1);
        txtcv=(TextView)findViewById(R.id.resultcgpa);

        btnc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput();
                resultcgpaset= num1/num2;
                txtcv.setText( num1 +"/"+num2+"="+resultcgpaset);
            }
        });
    }
    public void numberInput()

    {   //cheking number field empty or not
        if (TextUtils.isEmpty(etxtc1.getText().toString())||TextUtils.isEmpty((etxtc2.getText().toString())))
        {
            return;
        }
        else {   //parse string value to float value
            num1 = Float.parseFloat(etxtc1.getText().toString());
            num2 = Float.parseFloat(etxtc2.getText().toString());
            if(num1<1||num2>4)
            {
                num1=0;
                Toast.makeText(this, "Wrong Input", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
