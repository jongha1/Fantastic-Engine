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

import org.w3c.dom.Text;

public class MainPage2_button2 extends Activity {

    String name="";
    Button btn_sub;
    TextView tv_mainpage2_2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);    // token 이름의 기본모드 설정
        name = pref.getString("name", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage2_button2);

        btn_sub = findViewById(R.id.btn1);
        tv_mainpage2_2 = findViewById(R.id.tv_mainpage2_2);

        tv_mainpage2_2.setText("소란스러움에 반란군이 쇠창살을 총으로 두들겨 친다. 조용히 해. 쇠창살 사이로 들이밀어" +
                " 말하던 늙은 남자를 쏘아 죽인다. 얼굴이 하얗게 질린 " +name+"은 반란군과 눈을 마주친다. 욕을 지껄이던 반란군은" +
                " 이름을 거칠게 잡아 밖으로 끌어낸다. 속으로 욕을 짓씹고 반항하던 이름을 반란군이 두들겨 팬다. (hp 깎이는 행동)");
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage3.class);
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
