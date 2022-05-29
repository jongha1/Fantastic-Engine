package com.example.teamproject;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AlertDialog;

public class MainPage3 extends Activity {

    Button btn_sub1;
    Button btn_sub2;
    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage3);

        btn_sub1 = findViewById(R.id.btn1);
        btn_sub2 = findViewById(R.id.btn2);

        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        int HP = HPintent.getIntExtra("currHP",100);

        progress = (ProgressBar)findViewById(R.id.progressBar7);
        progress.setProgress(HP);

        btn_sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage3_button1.class);
                intent.putExtra("currHP",HP);
                startActivity(intent);
            }
        });

        btn_sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage3_button2.class);
                intent.putExtra("currHP",HP);
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
