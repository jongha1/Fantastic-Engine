package com.example.teamproject;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class MainPage2 extends Activity {
    String name = "";
    ImageButton btn_sub2;
    private ProgressBar progress;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);    // token 이름의 기본모드 설정
        name = pref.getString("name", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage2);

        btn_sub2 = findViewById(R.id.btn1);
        textView = findViewById(R.id.text1);
        textView.setText("핼쑥한 늙은 남자가 상고어로 빠르게 중얼거린다. 그러자 여러 사람들이 중얼거린다. " +
                        "상고어와 불어를 알던 "+name+"은 말을 들어보려 노력한다. 반란군, 사살, 죽음. 단편적인 단어밖에 들리지 않는다. " +
                        "대화를 듣던 "+name+"은 좁은 방안에서 일어선다.");
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        int HP = HPintent.getIntExtra("currHP",100);

        //HP를 줄이고싶으면 HP -= 20, HP를 늘리고싶으면 HP += 20을 추가

        // xml의 progress바의 id명을 넣기
        progress = (ProgressBar)findViewById(R.id.progressBar2);
        progress.setProgress(HP);

        btn_sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPage2_buttons.class);
                intent.putExtra("currHP",HP);
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
