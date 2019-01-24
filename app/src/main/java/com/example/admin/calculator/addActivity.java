package com.example.admin.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addActivity extends AppCompatActivity {
EditText e1,e2,e3,e4;
    Button b1,b2;
    String s1,s2,s3,s4;
    int w,x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        e1=(EditText)findViewById(R.id.an1);
        e2=(EditText)findViewById(R.id.an2);
        e3=(EditText)findViewById(R.id.an3);
        e4=(EditText)findViewById(R.id.re);

        b1=(Button)findViewById(R.id.add1);
        b2=(Button)findViewById(R.id.bk1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                w=Integer.parseInt(s1);
                x=Integer.parseInt(s2);
                y=Integer.parseInt(s3);
                z=w+x+y;
                s4=String.valueOf(z);
                e4.setVisibility(view.VISIBLE);
                e4.setText(s4);
//                Toast.makeText(getApplicationContext(),s4,Toast.LENGTH_LONG).show();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(e);
            }
        });

    }
}
