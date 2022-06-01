package com.example.teamproject;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class MainPage7_buttons2_2 extends Activity {

    Button btn_sub;
    //
    private ProgressBar progress;
    int HP;
    //
    TextView textView;
    String name = "";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);
        name = pref.getString("name", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage7_buttons2_2);
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);
        progress = (ProgressBar)findViewById(R.id.progressBar41);
        progress.setProgress(HP);
        //
        btn_sub = findViewById(R.id.btn1);
        textView = findViewById(R.id.text1);
        textView.setText(name+"은 그 문자를 무시하기로 마음 먹었다. '빌어먹을, 어떻게든 되라지.' " +
                "문자를 멍하니 바라보며 어떻게 탈출할지 고민하던 " +name+
                "은 거친 욕설과 함께 독방 앞으로 온 군인과 마주친다. 군인은 "+ name+
                "의 머리에 총구를 들이민다. (hp 모두 깎이게 하기, 죽음 엔딩)");
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), deathending1.class);
                //
                intent.putExtra("currHP",HP);
                //
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
