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

public class MainPage7_3 extends Activity {

    ImageButton btn_sub;
    //
    private ProgressBar progress;
    int HP;
    TextView textView;
    String name="";
    //
    @Override
    protected void onCreate(Bundle savedInstanceState){
        SharedPreferences pref = getSharedPreferences("name", MODE_PRIVATE);
        name = pref.getString("name", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage7_3);
        textView = findViewById(R.id.text1);
        textView.setText("전화가 끊겨 텅 비어 있는 화면을 "+name+"은 바라본다. 텅 비어 있는 화면에 문자가 뜬다. 찾으면 죽여버리겠다. " +
                "간단히 뜬 문자에 "+name+"은 잠시 숨을 멈춘다.");
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);
        progress = (ProgressBar)findViewById(R.id.progressBar35);
        progress.setProgress(HP);
        //
        btn_sub = findViewById(R.id.btn1);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage7_buttons2.class);
                //
                intent.putExtra("currHP",HP);
                //
                startActivity(intent);
            }
        });
    }
//


}
