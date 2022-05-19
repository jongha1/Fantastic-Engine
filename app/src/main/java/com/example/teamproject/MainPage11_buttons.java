package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainPage11_buttons extends Activity {
    //Button btn_sub1;
    Button btn_sub2;
    Button btn_sub3;
    Button btn_rd1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage011_buttons);

      //  btn_sub1 = findViewById(R.id.btn1);
        btn_sub2 = findViewById(R.id.btn2);
        btn_sub3 = findViewById(R.id.btn3);
        btn_rd1 = findViewById(R.id.rdbtn1);


        String[] randomBtn = getResources().getStringArray(R.array.mp11_rdbtn1);
        Random random = new Random();
        int n = random.nextInt(randomBtn.length - 0);
        btn_rd1.setText(randomBtn[n]);

        btn_rd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage11_button1.class);
                startActivity(intent);
            }
        });

        btn_sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage11_button2.class);
                startActivity(intent);
            }
        });

        btn_sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage11_button3.class);
                startActivity(intent);
            }
        });

    }
}
