package com.example.teamproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainPage8_popup1 extends Activity {

    //EditText editText;
    Button btn;
    //
    int HP;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //타이틀바 없애기
        setContentView(R.layout.mainpage8popup);
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);
        //진동
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(500);
        //
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(btnListener);
    }

    //팝업영역 밖을 터치할시 꺼짐 방지를 위해 선언
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_OUTSIDE) {
            return false;
        }
        return true;
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
             //String name = editText.getText().toString();

            Intent intent = new Intent(getApplicationContext(), MainPage8_1.class);
            //intent.putExtra("name",name); // 이름 받아 넘길때 필요
            //
            intent.putExtra("currHP",HP);
            //
            startActivity(intent);
        }
    };
}

