package com.example.scoreboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    Button a1;
    Button a2;
    Button a3;
    Button a4;
    Button a5;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button reset;
    int a;
    int b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        a3=findViewById(R.id.a3);
        a4=findViewById(R.id.a4);
        a5=findViewById(R.id.a5);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        reset=findViewById(R.id.RESET);

        tv1=findViewById(R.id.A_COUNT);
        tv2=findViewById(R.id.B_COUNT);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                tv1.setText(""+a);
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=2;
                tv1.setText(""+a);
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=3;
                tv1.setText(""+a);
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=4;
                tv1.setText(""+a);
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=6;
                tv1.setText(""+a);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b++;
                tv2.setText(""+b);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b+=2;
                tv2.setText(""+b);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b+=3;
                tv2.setText(""+b);
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b+=4;
                tv2.setText(""+b);
            }

        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b+=6;
                tv2.setText(""+b);
            }

        });
        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                b=0;
                tv2.setText(""+b);
                a=0;
                tv1.setText(""+a);
            }
        });
        if(savedInstanceState!=null) {
            String s = savedInstanceState.getString("Vikash");
            String s1 = savedInstanceState.getString("sunny");
            tv1.setText(s);
            tv2.setText(s1);
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Vikash",tv1.getText().toString());
        outState.putString("sunny",tv2.getText().toString());
    }
}
