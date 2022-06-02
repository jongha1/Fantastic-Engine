package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler; //핸들러 사용에 필요

public class MainPage12_s extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage12_s);
        Handler timer = new Handler(); //Handler 생성
        timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainPage12.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
