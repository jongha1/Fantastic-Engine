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

public class MainPage4_button2_1_2 extends Activity {

    String name="";
    TextView tv_mainpage4_2_1_2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);    // token 이름의 기본모드 설정
        name = pref.getString("name", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage4_button2_1_2);

        tv_mainpage4_2_1_2 = findViewById(R.id.tv_mainpage4_2_1_2);

        tv_mainpage4_2_1_2.setText(name+"은 주의 깊게 열쇠를 바라본다. 놀랍게도 모두 같은 모양의 열쇠들이다. "+
                                    "당장 쓸 수 없는 열쇠를 내려다 보던 "+name+"은 아무도 찾지 않는 독방에서 뜬눈으로 새벽을 보낸다." +
                                    " 새벽 두 시, "+name+"은 독방에서 수용소를 향한 폭격에 의해 사망한다. (hp 다 깎이게 하기," +
                                    " 성급하게 결정하지 마세요, 죽음 엔딩 1)");

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
