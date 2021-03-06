package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class NamePopup extends Activity {

    Button btn;
    EditText editText;
    String name ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //타이틀바 없애기
        setContentView(R.layout.namepopup);

        btn = findViewById(R.id.btn1);
        editText = findViewById(R.id.edit1);
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
            String name = editText.getText().toString();

            SharedPreferences pref= getSharedPreferences("name", MODE_PRIVATE);    // name 이름의 기본모드 설정
            SharedPreferences.Editor editor= pref.edit(); //sharedPreferences를 제어할 editor를 선언
            editor.putString("name",name); // key,value 형식으로 저장
            editor.commit();    //최종 커밋. 커밋을 해야 저장이 된다.

            Intent intent = new Intent(getApplicationContext(), MainPage1_s.class);
            startActivity(intent);
        }
    };


}