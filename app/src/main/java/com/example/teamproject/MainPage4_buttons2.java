package com.example.teamproject;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;

public class MainPage4_buttons2 extends Activity {

    Button btn_sub2;
    Button btn_sub3;
    Button btn_sub4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage4_buttons2);

        btn_sub2 = findViewById(R.id.btn2);
        btn_sub3 = findViewById(R.id.btn3);
        btn_sub4 = findViewById(R.id.btn4);

        btn_sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage4_button2_1.class);
                startActivity(intent);
            }
        });

        btn_sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage4_button2_2.class);
                startActivity(intent);
            }
        });

        btn_sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage4_button3.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder alert_ex = new AlertDialog.Builder(this);
        alert_ex.setMessage("앱을 닫으시겠습니까?");

        alert_ex.setNegativeButton("종료", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        });

        alert_ex.setPositiveButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alert = alert_ex.create();
        alert.show();

    }

}
