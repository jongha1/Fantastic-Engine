package com.example.teamproject;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainPage11_buttons extends Activity {

    Button btn_rd2;
    Button btn_rd3;
    Button btn_rd1;
    //
    private ProgressBar progress;
    int HP;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage011_buttons);
        //
        Intent HPintent = getIntent();  // intent를 가져오는 형식으로 초기화
        HP = HPintent.getIntExtra("currHP",100);
        progress = (ProgressBar)findViewById(R.id.progressBar60);
        progress.setProgress(HP);
        //
        Random rs = new Random();

      //  btn_sub1 = findViewById(R.id.btn1);
        btn_rd2 = findViewById(R.id.rdbtn2);
        btn_rd3 = findViewById(R.id.rdbtn3);
        btn_rd1 = findViewById(R.id.rdbtn1);


        String[] randomBtn1 = getResources().getStringArray(R.array.mp11_rdbtn1);
        Random random1 = new Random();
        int n1 = random1.nextInt(randomBtn1.length - 0);
        btn_rd1.setText(randomBtn1[n1]);

        String[] randomBtn2 = getResources().getStringArray(R.array.mp11_rdbtn2);
        Random random2 = new Random();
        int n2 = random2.nextInt(randomBtn2.length - 0);
        btn_rd2.setText(randomBtn2[n2]);

        String[] randomBtn3 = getResources().getStringArray(R.array.mp11_rdbtn3);
        Random random3 = new Random();
        int n3 = random3.nextInt(randomBtn3.length - 0);
        btn_rd3.setText(randomBtn3[n3]);

        ArrayList<String> strings = new ArrayList<String>();

        strings.add(btn_rd1.getText().toString());
        strings.add(btn_rd2.getText().toString());
        strings.add(btn_rd3.getText().toString());

        int r = rs.nextInt(3);
        int r1 = rs.nextInt(2);
        if (r == 0 && r1 == 0) {
            btn_rd1.setText(strings.get(r));
            btn_rd1 = findViewById(R.id.rdbtn1);
            strings.remove(r);
            btn_rd2.setText(strings.get(r1));
            btn_rd2 = findViewById(R.id.rdbtn2);
            strings.remove(r1);
            btn_rd3.setText(strings.get(0));
            btn_rd3 = findViewById(R.id.rdbtn3);
        } else if (r == 0 && r1 == 1) {
            btn_rd1.setText(strings.get(r));
            btn_rd1 = findViewById(R.id.rdbtn1);
            strings.remove(r);
            btn_rd2.setText(strings.get(r1));
            btn_rd2 = findViewById(R.id.rdbtn3);
            strings.remove(r1);
            btn_rd3.setText(strings.get(0));
            btn_rd3 = findViewById(R.id.rdbtn2);

        } else if (r == 1 && r1 == 0) {
            btn_rd1.setText(strings.get(r));
            btn_rd1 = findViewById(R.id.rdbtn2);
            strings.remove(r);
            btn_rd2.setText(strings.get(r1));
            btn_rd2 = findViewById(R.id.rdbtn1);
            strings.remove(r1);
            btn_rd3.setText(strings.get(0));
            btn_rd3 = findViewById(R.id.rdbtn3);
        } else if (r == 2 && r1 == 0) {
            btn_rd1.setText(strings.get(r));
            btn_rd1 = findViewById(R.id.rdbtn2);
            strings.remove(r);
            btn_rd2.setText(strings.get(r1));
            btn_rd2 = findViewById(R.id.rdbtn3);
            strings.remove(r1);
            btn_rd3.setText(strings.get(0));
            btn_rd3 = findViewById(R.id.rdbtn1);

        } else if (r == 1 && r1 == 1) {
            btn_rd1.setText(strings.get(r));
            btn_rd1 = findViewById(R.id.rdbtn3);
            strings.remove(r);
            btn_rd2.setText(strings.get(r1));
            btn_rd2 = findViewById(R.id.rdbtn1);
            strings.remove(r1);
            btn_rd3.setText(strings.get(0));
            btn_rd3 = findViewById(R.id.rdbtn2);

        } else if (r == 2 && r1 == 1) {
            btn_rd1.setText(strings.get(r));
            btn_rd1 = findViewById(R.id.rdbtn3);
            strings.remove(r);
            btn_rd2.setText(strings.get(r1));
            btn_rd2 = findViewById(R.id.rdbtn2);
            strings.remove(r1);
            btn_rd3.setText(strings.get(0));
            btn_rd3 = findViewById(R.id.rdbtn1);
        }

        btn_rd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage11_button1.class);
                //
                intent.putExtra("currHP",HP);
                //
                startActivity(intent);
            }
        });

        btn_rd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage11_button2.class);
                //
                intent.putExtra("currHP",HP);
                //
                startActivity(intent);
            }
        });

        btn_rd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage11_button3.class);
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
