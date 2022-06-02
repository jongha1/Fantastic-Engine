package com.example.teamproject;

import android.app.Activity;
import android.content.Intent; //Intent 사용에 필요
import android.os.Bundle;
import android.os.Handler; //핸들러 사용에 필요

public class MainPage2_s extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage2_s);
        Handler timer = new Handler(); //Handler 생성
        timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainPage2.class);
                startActivity(intent); //다음 액티비티 이동
                finish(); // 이 액티비티를 종료
            }
        }, 2000); //2000은 2초를 의미한다.
    }
}
