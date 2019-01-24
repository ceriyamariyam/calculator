package com.example.admin.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.add1);
        b2 = (Button)findViewById(R.id.sub);
        b3=(Button)findViewById(R.id.mul);
        b4=(Button)findViewById(R.id.div);
        b5=(Button)findViewById(R.id.lar);
        b6=(Button)findViewById(R.id.sma);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),addActivity.class);
                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent e=new Intent(getApplicationContext(),subActivity.class);
                startActivity(e);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(getApplicationContext(),mulActivity.class);
                startActivity(s);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f=new Intent(getApplicationContext(),divActivity.class);
                startActivity(f);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(getApplicationContext(),largestActivity.class);
                startActivity(b);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q=new Intent(getApplicationContext(),smallestActivity.class);
                startActivity(q);
            }
        });

    }
}
