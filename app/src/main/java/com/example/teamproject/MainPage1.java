package com.example.teamproject;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class MainPage1 extends Activity {

    String name = ""; //스트링변수선언 (매패이지마다 붙이기)
    Button btn_sub;
    TextView tv_mainpage1;
    //TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);    // token 이름의 기본모드 설정
        name = pref.getString("name", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage1);

//      Shared 받아오는거(매 패이지마다 붙이기)


        btn_sub = findViewById(R.id.btn1);
        tv_mainpage1 = findViewById(R.id.tv_mainpage1);
        tv_mainpage1.setText("오래된 중앙아프리카 공화국 내전을 취재하러 온 "+name+ "은 시민들을 취재하다 혼자 떨어져 폭발물에 휩쓸렸다. " +
                "눈을 떠 보니, 좁고 고름 냄새로 퀴퀴한 감옥 안이었다. 혹시나 하는 마음에 몸을 움직여 봤지만, " +
                "뜻대로 움직여 주지 않는다. 주위를 둘러 보니 여러 명의 사람이 갇혀 있다."+name+"은 방안을 둘러본다.");



        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage1_buttons.class);
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
