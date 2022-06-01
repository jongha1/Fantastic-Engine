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

public class MainPage3_button2_1 extends Activity {

    String name="";
    Button btn_sub;
    //
    private ProgressBar progress;
    int HP;
    //
    TextView tv_mainpage3_2_1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);    // token 이름의 기본모드 설정
        name = pref.getString("name", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage3_button2_1);
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);
        progress = (ProgressBar)findViewById(R.id.progressBar10);
        progress.setProgress(HP);
        //
        btn_sub = findViewById(R.id.btn1);
        tv_mainpage3_2_1 = findViewById(R.id.tv_mainpage3_2_1);

        tv_mainpage3_2_1.setText("수용소와 감옥 열쇠 꾸러미다. 열쇠를 조심히 끌어내 품 안으로 숨긴다. 간수는 "
                +name+"을 잡아 복도를 지나 좁고 어두운 독방에 가둔다. 독방에는 피냄새가 낭자하다.");



        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage4.class);
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
