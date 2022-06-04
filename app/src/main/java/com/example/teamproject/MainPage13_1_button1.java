package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainPage13_1_button1 extends Activity {

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
        setContentView(R.layout.mainpage013_1_button1);
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);
        progress = findViewById(R.id.progressBar71);
        progress.setProgress(HP);
        //
        btn_sub = findViewById(R.id.btn1);
        textView = findViewById(R.id.text1);
        textView.setText(name+"은 피를 흘려 흐리고 어두운 시야 속에서 군인을 향해 총을 두어 번 쏜다. " +
                        "'저건, 저건 짐승이다. 사람이 아냐.' 속으로 되씹으며 쓰러진 군인을 뒤로 한 채 지프를 향해 뛴다.");

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
