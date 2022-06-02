package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainPage13_1 extends Activity {

    Button btn_sub;
    //
    private ProgressBar progress;
    int HP;
    //
    TextView textView;
    String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);
        name = pref.getString("name", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage013_1);
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);
        progress = findViewById(R.id.progressBar69);
        progress.setProgress(HP);
        //
        btn_sub = findViewById(R.id.btn1);
        textView = findViewById(R.id.text1);
        textView.setText("겁에 질린 "+name+"은 총알이 박혀 부상당한 왼쪽 팔을 붙들고 뛰기 시작한다. " +
                "'지프만 타면 된다!' 이를 악물고 뛰는 "+name+"의 품에서 권총이 잡힌다. " +
                name+"은 홀린듯이 품을 뒤져 총을 잡는다. "+name+"은 총을 잡고 향해 뛰어오는 군인을 돌아본다.");

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage13_1_buttons.class);
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
