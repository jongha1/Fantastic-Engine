package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage9_buttons extends Activity {

    Button btn_sub1;
    Button btn_sub2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage9_buttons);

        btn_sub1 = findViewById(R.id.btn1);
        btn_sub2 = findViewById(R.id.btn2);

        btn_sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage9_button1.class);
                startActivity(intent);
            }
        });

        btn_sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage9_button2.class);
                startActivity(intent);
            }
        });

    }
}