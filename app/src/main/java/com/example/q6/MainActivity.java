package com.example.q6;
//Java Program to Check Whether a Number is Even or Odd
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edText);
        btn = (Button) findViewById(R.id.btnResult);
        tv = (TextView) findViewById(R.id.tvResult);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(editText.getText().toString());
                if(a%2==0){
                    tv.setText("Enter number is Even");
                }else{
                    tv.setText("Entered number is Odd");
                }
            }
        });
    }
}