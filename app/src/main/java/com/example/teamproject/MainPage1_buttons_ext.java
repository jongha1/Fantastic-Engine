package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainPage1_buttons_ext extends Activity {

    Button btn_rd2;
    Button btn_rd3;

    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage1_buttons_ext);

        btn_rd2 = findViewById(R.id.extbtn2);
        btn_rd3 = findViewById(R.id.extbtn3);

        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        int HP = HPintent.getIntExtra("currHP",100);
        progress = (ProgressBar)findViewById(R.id.extProgressBar);
        progress.setProgress(HP);

        btn_rd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage2.class);
                intent.putExtra("currHP",HP);
                startActivity(intent);
            }
        });

        btn_rd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage1_button3.class);
                intent.putExtra("currHP",HP);
                startActivity(intent);
            }
        });
    }
}

