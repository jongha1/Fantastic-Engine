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
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class MainPage2_button2 extends Activity {

    Button btn_sub;
    //
    private ProgressBar progress;
    int HP;
    //
    String name = "";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage2_button2);
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);    // token 이름의 기본모드 설정
        name = pref.getString("name", "");
        //진동
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(500);
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);

        HP -= 30;
        progress = (ProgressBar)findViewById(R.id.progressBar4);
        progress.setProgress(HP);
        Intent intent = new Intent(getApplicationContext(), MainPage2_buttons.class);
        intent.putExtra("currHP",HP);
        //
        btn_sub = findViewById(R.id.btn1);
        textView = findViewById(R.id.text1);
        textView.setText("소란스러움에 반란군이 쇠창살을 총으로 두들겨 친다. 조용히 해. " +
                "쇠창살 사이로 들이밀어 말하던 늙은 남자를 쏘아 죽인다. 얼굴이 하얗게 질린 "+name+"은 반란군과 눈을 마주친다. " +
                "욕을 지껄이던 반란군은 이름을 거칠게 잡아 밖으로 끌어낸다. 속으로 욕을 짓씹고 반항하던 " +
                name+"을 반란군이 두들겨 팬다. (hp 깎이는 행동)");
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage3.class);
                //
                intent.putExtra("currHP",HP);
                //
                startActivity(intent);
            }
        });
    }
//    @Override
//    public void onBackPressed() {
//        AlertDialog.Builder alert_ex = new AlertDialog.Builder(this);
//        alert_ex.setMessage("앱을 닫으시겠습니까?");
//
//        alert_ex.setNegativeButton("종료", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                finishAffinity();
//            }
//        });
//
//        alert_ex.setPositiveButton("취소", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//            }
//        });
//        AlertDialog alert = alert_ex.create();
//        alert.show();
//
//    }

}
