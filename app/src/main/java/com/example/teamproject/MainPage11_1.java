package com.example.teamproject;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class MainPage11_1 extends Activity {

    TextView textView;
    ImageButton btn_sub;
    //
    private ProgressBar progress;
    int HP;
    //
    String name = "";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage011_1);
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);
        progress = (ProgressBar)findViewById(R.id.progressBar56);
        progress.setProgress(HP);
        //
        btn_sub = findViewById(R.id.btn1);
        textView = findViewById(R.id.text1);
        textView.setText("안도하던 "+name+"은 전화가 와 요란하게 울리는 핸드폰에게 당황한다." +
                " 동시에 군화 소리가 점점 가까워진다. 전화를 받지 않던"+ name+"은 누군가가 자신이 걸어잠근 문 앞에 서 있는 걸 느낀다." +
                " 가만히 서 있던 누군가가 궁금해 틈 사이를 살피자, 핸드폰을 빼앗겼던 군인과 눈이 마주친다. " +
                "'죽는다고 했지.' 군인은 총을 들어 화장실 문앞을 난사한다."+ name+"의 눈앞은 캄캄해진다.");

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), deathending1.class);
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
