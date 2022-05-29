package com.example.teamproject;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;

public class MainPage5_4 extends Activity {

    Button btn_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage5_4);

        btn_sub = findViewById(R.id.btn1);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainPage6.class);
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
