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
import android.widget.TextView;

public class Ending_Second extends Activity {

    ImageButton btn_sub;
    //
//    private ProgressBar progress;
//    int HP;
    //
    TextView textView;
    String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);
        name = pref.getString("name", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ending_second);
        //
//        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
//        HP = HPintent.getIntExtra("currHP",100);
//        progress = findViewById(R.id.progressBar64);
//        progress.setProgress(HP);
        //
        btn_sub = findViewById(R.id.btn1);
        textView = findViewById(R.id.text1);
        textView.setText("\""+name+"씨! 괜찮으십니까? "+name+"씨!\" 지프에 간신히 타 숨을 쌕쌕 내쉬던 " +
                        name+"은 익숙한 언어와 안도감에 눈을 감는다. \"피를 이미 많이 흘렸어. 응급이야. 얼른 가자.\" " +
                        "사람들이 크게 소리지른다. 불편한 탑승감에도 "+name+"은 좀처럼 깨지 못했지만, "
                +name+"의 어깨를 두드리며 지혈하는 사람들 때문에 눈을 반쯤 뜬다. '그래도 다행이다.' "+
                name+"은 작은 창문을 바라보며 생각한다.");

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Finish.class);
//                intent.putExtra("currHP",HP);
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
