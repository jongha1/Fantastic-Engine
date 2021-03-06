package com.example.teamproject;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class MainPage4_button2_1_1 extends Activity {

    ImageButton btn_sub;
    private ProgressBar progress;
    int HP;
    String name="";
    TextView tv_mainpage4_2_1_1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);    // token 이름의 기본모드 설정
        name = pref.getString("name", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage4_button2_1_1);
        //진동
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(500);

        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);

        HP = 0;
        progress = (ProgressBar)findViewById(R.id.progressBar16);
        progress.setProgress(HP);

        btn_sub = findViewById(R.id.btn1);

        tv_mainpage4_2_1_1 = findViewById(R.id.tv_mainpage4_2_1_1);
        tv_mainpage4_2_1_1.setText("아무런 준비도 안 됐는데, 맨몸으로 이곳을 나가는 게 가능할까? "+
                name+"은 고민하다 쇠창살 사이로 손을 넣어 열쇠로 문을 딴다. "+
                name+"은 조심스레 문을 여는 데 성공한다. 하지만 곧 거칠게 문을 여는 소리가 들린다. "+
                name+"에게 열쇠를 빼앗긴 반란군이 그에게 총구를 겨눈다.");

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), deathending3.class);
                intent.putExtra("currHP", HP);
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

