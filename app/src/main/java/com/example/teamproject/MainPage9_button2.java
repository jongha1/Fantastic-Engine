package com.example.teamproject;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class MainPage9_button2 extends Activity {

    ImageButton btn_sub;
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
        setContentView(R.layout.mainpage9_button2);
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);
        progress = (ProgressBar)findViewById(R.id.progressBar50);
        progress.setProgress(HP);
        //
        btn_sub = findViewById(R.id.btn1);
        textView = findViewById(R.id.text1);
        textView.setText("군화 발자국 소리를 들으며 "+ name+"은 조심스레 오른쪽을 향해 몸을 꺾어 들어간다. 화장실이 눈앞에 보인다. " +
                name+"은 조심스레 화장실 문을 연다.");

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage10_s.class);
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

