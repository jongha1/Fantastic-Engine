package com.example.teamproject;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.os.Handler;

import androidx.appcompat.app.AlertDialog;

import org.w3c.dom.Text;

public class MainPage3 extends Activity {

    ImageButton btn_sub1;
    ImageButton btn_sub2;
    //
    private ProgressBar progress;
    int HP;
    //
    String name = "";
    TextView tv_mainpage3;
    TextView timer;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);    // token 이름의 기본모드 설정
        name = pref.getString("name", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage3);
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);
        progress = (ProgressBar)findViewById(R.id.progressBar7);
        progress.setProgress(HP);
        //
        btn_sub1 = findViewById(R.id.btn1);
        btn_sub2 = findViewById(R.id.btn2);
        tv_mainpage3 = findViewById(R.id.tv_mainpage3);
        timer = findViewById(R.id.timer);

        CountDownTimer countDownTimer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntillFinished) {
                int num = (int) (millisUntillFinished / 1000);
                timer.setText(Integer.toString(num+1));

            }

            @Override
            public void onFinish() {
                // new Handler().postDelayed(new Runnable() { //
                   // @Override
                    // public void run() {
                       // Intent intent = new Intent(MainPage3.this, deathending1.class);
                       // startActivity(intent);
                //    }
                // }, 10000);

            }
        }.start();

        tv_mainpage3.setText("두들겨 맞던 "+name+"의 눈에 반란군이 지닌 물건들이 띈다. 저항할까? 맞아가며 저걸 빼앗을까? (타이머 10초)");

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
//    @Override
//    public void onBackPressed() {
//        AlertDialog.Builder alert_ex = new AlertDialog.Builder(this);
//        alert_ex.setMessage("앱을 닫으시겠습니까?");
//
//        alert_ex.setNegativeButton("종료", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                finishAffinity();
//            }
//        });
//
//        alert_ex.setPositiveButton("취소", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//            }
//        });
//        AlertDialog alert = alert_ex.create();
//        alert.show();
//
//    }

}
