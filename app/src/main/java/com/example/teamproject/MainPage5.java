package com.example.teamproject;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;

public class MainPage5 extends Activity {

    String name="";
    Button btn_sub;
    TextView txtResult;
    //
    private ProgressBar progress;
    int HP;
    //
    TextView tv_mainpage5;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);    // token 이름의 기본모드 설정
        name = pref.getString("name", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage5);
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);
        progress = (ProgressBar)findViewById(R.id.progressBar23);
        progress.setProgress(HP);
        //
        btn_sub = findViewById(R.id.btn1);
        tv_mainpage5 = findViewById(R.id.tv_mainpage5);

        tv_mainpage5.setText("아무것도 할 수 있는 게 없다. 이대로 죽을 수밖에 없나? 구석에" +
                            " 쭈그려 앉아 쉬던 " +name+"은 물건이 아무것도 도움이 안 된다는 생각에 빠진다. 생각을 곱씹던 " +
                            name+"의 주머니 속에서 핸드폰 진동이 울린다. (진동 효과) 캘린더 알림이 잠긴 핸드폰 위에 뜬다.");


        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage5_popup1.class);
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