package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Ending_First extends Activity {

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
        setContentView(R.layout.ending_first);
        //
//        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
//        HP = HPintent.getIntExtra("currHP",100);
//        progress = findViewById(R.id.progressBar64);
//        progress.setProgress(HP);
        //
        btn_sub = findViewById(R.id.btn1);
        textView = findViewById(R.id.text1);
        textView.setText("'그런 일도 있었지.' "+name+"은 한국에 와 병원에서 여러 가지 검사를 받아야 해 입원해 있다. " +
                "그대로 죽는 줄 알았던 여러 일들이 스쳐지나가자 "+name+"은 다시는 종군 기자로 뛸 수 없는 느낌이 든다. " +
                "'그래도.......' "+name+"은 자기 팔에 꽂힌 여러 수액을 바라본다. " +
                "사명감 같은 건 없었으나 할 수 있을 만큼의 일을 했던 "+name+"은 안도감에 찬다. 별탈은 없을 거라는 말들, " +
                name+"을 병문안하러 온 사람들의 말들이 귀에 꽂힌다.");

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Finish.class);
//                intent.putExtra("currHP",HP);
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
