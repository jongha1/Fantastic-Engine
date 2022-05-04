package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage3_button2 extends Activity {

    Button btn_sub1;
    Button btn_sub2;
    Button btn_sub3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage3_button2);

        btn_sub1 = findViewById(R.id.btn4);
        btn_sub2 = findViewById(R.id.btn5);
        btn_sub3 = findViewById(R.id.btn6);

        btn_sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage3_button2_1.class);
                startActivity(intent);
            }
        });

        btn_sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage3_button2_2.class);
                startActivity(intent);
            }
        });

        btn_sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage3_button2_3.class);
                startActivity(intent);
            }
        });
    }
}
