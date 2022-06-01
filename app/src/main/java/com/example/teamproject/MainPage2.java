package com.example.teamproject;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AlertDialog;

public class MainPage2 extends Activity {

    Button btn_sub2;
    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage2);

        btn_sub2 = findViewById(R.id.btn1);

        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        int HP = HPintent.getIntExtra("currHP",100);

        //HP를 줄이고싶으면 HP -= 20, HP를 늘리고싶으면 HP += 20을 추가

        // xml의 progress바의 id명을 넣기
        progress = (ProgressBar)findViewById(R.id.progressBar2);
        progress.setProgress(HP);

        btn_sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage2_buttons.class);
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
