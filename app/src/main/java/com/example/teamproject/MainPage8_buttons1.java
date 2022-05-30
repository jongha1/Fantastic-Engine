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

public class MainPage8_buttons1 extends Activity {

    Button btn_sub;
    TextView textView;
    String name = "";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);
        name = pref.getString("name", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage8_button1);

        btn_sub = findViewById(R.id.btn1);
        textView = findViewById(R.id.text1);
        textView.setText("슬며시 몸을 넣어 끊어진 쇠창살을 통과한 " +
                name+"은 숨을 죽이며 복도를 지나 닫힌 철문을 바라본다. 깜깜하고 아무것도 보이지 않는다. 그 사이에 " +
                name+"은 다시 핸드폰을 켜 gps를 차단한다.");
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage8_1.class);
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
