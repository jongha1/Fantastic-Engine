package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Page2Activity extends Activity {

    Button btn_sub1;
    Button btn_sub2;
    Button btn_sub3;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        btn_sub1 = findViewById(R.id.btn4);
        btn_sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Page3Activity.class);
                startActivity(intent);
            }
        });

        btn_sub2 = findViewById(R.id.btn5);
        btn_sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Page4Activity.class);
                startActivity(intent);
            }
        });
        btn_sub3 = findViewById(R.id.btn6);
        btn_sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Page5Activity.class);
                startActivity(intent);
            }
        });

    }
}