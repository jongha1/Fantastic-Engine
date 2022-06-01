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

public class MainPage8 extends Activity {

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
        setContentView(R.layout.mainpage8);
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);
        progress = (ProgressBar)findViewById(R.id.progressBar42);
        progress.setProgress(HP);
        //
        btn_sub = findViewById(R.id.btn1);
        textView = findViewById(R.id.text1);
        textView.setText("나가기는 충분하지만, 협박과 탈출할 수 있을지 고민하던 " +name+"은 긴장하며 시간을 센다.");
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage8_buttons.class);
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