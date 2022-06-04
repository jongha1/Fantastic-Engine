package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler; //핸들러 사용에 필요

public class MainPage12_s extends Activity {
    //
    int HP;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage12_s);
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);
        //
        Handler timer = new Handler(); //Handler 생성
        timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainPage12.class);
                //
                intent.putExtra("currHP",HP);
                //
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
