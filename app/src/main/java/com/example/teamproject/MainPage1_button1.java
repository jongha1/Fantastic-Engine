package com.example.teamproject;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import java.util.Random;

import androidx.appcompat.app.AlertDialog;

public class MainPage1_button1 extends Activity {

    ImageButton btn_sub;
    private ProgressBar mainpageBtn1Bar;
    int HP;

    Random rd = new Random();
    int[] rdNum = {20, 30, 40};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage1_button1);
        //진동
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(500);

        Intent HPintent = getIntent();
        HP = HPintent.getIntExtra("currHP",100);
        HP -= rdNum[rd.nextInt(2)];
        mainpageBtn1Bar = (ProgressBar)findViewById(R.id.main1btn1Progressbar);
        mainpageBtn1Bar.setProgress(HP);

        Intent intent = new Intent(getApplicationContext(), MainPage1_buttons.class); // 버튼3개있는 페이지에 값 넘기는걸로 객체 생성
        intent.putExtra("currHP",HP); //

        btn_sub = findViewById(R.id.btn1);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (HP <= 0) {
                    Intent intent = new Intent(getApplicationContext(), deathending0.class);
                    intent.putExtra("currHP", HP);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), MainPage1_buttons.class);
                    intent.putExtra("currHP", HP);
                    startActivity(intent);
                }
                /*
                if(HP <= 0 ) {
                    Intent intent = new Intent(getApplicationContext(), 죽음.class);
                    intent.putExtra("currHP", HP);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(), mainpage1_buttons_ext.class);
                    intent.putExtra("currHP", HP);
                    startActivity(intent);
                }
                */
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
