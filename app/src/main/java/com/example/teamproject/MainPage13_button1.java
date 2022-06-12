package com.example.teamproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class MainPage13_button1 extends Activity {

    ImageButton btn_sub;
    //
    private ProgressBar progress;
    int HP;
    Random rd = new Random();
    int[] rdNum = {20, 30, 40};
    //
    TextView textView;
    String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);
        name = pref.getString("name", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage013_button1);
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);

        HP -= rdNum[rd.nextInt(2)];
        progress = findViewById(R.id.progressBar67);
        progress.setProgress(HP);
        Intent intent = new Intent(getApplicationContext(), MainPage13_buttons.class);
        intent.putExtra("currHP",HP);
        //
        btn_sub = findViewById(R.id.btn1);
        textView = findViewById(R.id.text1);
        textView.setText(name+"은 몸을 돌려 군인을 바라본다. 군인은 장전된 권총을 다른 손에 쥐고 " +
                        "핸드폰을 들어 어디론가 전화를 건다. " +name+"이 지닌 핸드폰에서 진동이 울린다. " +
                        "군인이 씨익 웃으며 "+name+"을 권총을 든 채로 응시한다. 타앙. 총소리가 들린다.");

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (HP <= 0) {
                    Intent intent = new Intent(getApplicationContext(), deathending1.class);
                    intent.putExtra("currHP", HP);
                    startActivity(intent);
                } else if (HP <= 25) {
                    Intent intent = new Intent(getApplicationContext(), Ending_First.class);
                    intent.putExtra("currHP", HP);
                    startActivity(intent);
                } else if (HP <= 50) {
                    Intent intent = new Intent(getApplicationContext(), Ending_Second.class);
                    intent.putExtra("currHP", HP);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getApplicationContext(), Ending_Third.class);
                    intent.putExtra("currHP", HP);
                    startActivity(intent);
                }
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
