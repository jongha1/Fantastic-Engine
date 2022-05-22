package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainPage1_button1 extends Activity {

    Button btn_sub;
    private ProgressBar mainpageBtn1Bar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage1_button1);

        Intent HPintent = getIntent();
        int HP = HPintent.getIntExtra("currHP",100);

        HP -= 20;
        mainpageBtn1Bar = (ProgressBar)findViewById(R.id.main1btn1Progressbar);
        mainpageBtn1Bar.setProgress(HP);

        Intent intent = new Intent(getApplicationContext(), MainPage1_buttons.class); // 버튼3개있는 페이지에 값 넘기는걸로 객체 생성
        intent.putExtra("currHP",HP); //

        btn_sub = findViewById(R.id.btn1);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}