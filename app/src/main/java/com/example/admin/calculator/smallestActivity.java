package com.example.admin.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class smallestActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b1,b2;
    String s1,s2,s3;
    int n1,n2,n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smallest);
        e1=(EditText)findViewById(R.id.sn1);
        e2=(EditText)findViewById(R.id.sn2);
        e3=(EditText)findViewById(R.id.sn3);
        e4=(EditText)findViewById(R.id.re5);
        b1=(Button)findViewById(R.id.smal);
        b2=(Button)findViewById(R.id.bk6);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                n3=Integer.parseInt(s3);
                if ((n1<n2)  &&  (n1<n3)) {
                    e4.setVisibility(view.VISIBLE);
                    e4.setText(s1);
//                    Toast.makeText(getApplicationContext(), s1, Toast.LENGTH_LONG).show();
                }
                else if ((n2<n1)  &&  (n2<n3)) {
                    e4.setVisibility(view.VISIBLE);
                    e4.setText(s2);
//                    Toast.makeText(getApplicationContext(), s2, Toast.LENGTH_LONG).show();
                }
                else if ((n3<n1)  &&  (n3<n2)) {
                    e4.setVisibility(view.VISIBLE);
                    e4.setText(s3);
//                    Toast.makeText(getApplicationContext(), s3, Toast.LENGTH_LONG).show();


                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(j);
            }
        });

    }
}
