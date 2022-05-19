package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainPage1_buttons extends Activity {

    Button btn_rd1;
    Button btn_rd2;
    Button btn_rd3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage1_buttons);
        Random rs = new Random();

        btn_rd1 = findViewById(R.id.btn1);
        btn_rd2 = findViewById(R.id.btn2);
        btn_rd3 = findViewById(R.id.btn3);

        String[] randomBtn1 = getResources().getStringArray(R.array.mp1_rdbtn1);
        Random random1 = new Random();
        int n1 = random1.nextInt(randomBtn1.length - 0);
        btn_rd1.setText(randomBtn1[n1]);

        String[] randomBtn2 = getResources().getStringArray(R.array.mp1_rdbtn2);
        Random random2 = new Random();
        int n2 = random2.nextInt(randomBtn2.length - 0);
        btn_rd2.setText(randomBtn2[n2]);

        String[] randomBtn3 = getResources().getStringArray(R.array.mp1_rdbtn3);
        Random random3 = new Random();
        int n3 = random3.nextInt(randomBtn3.length - 0);
        btn_rd3.setText(randomBtn3[n3]);
        
        
       //List<String> story = new ArrayList<>();
        String[] Str1 = new String[3];
        Str1 = getResources().getStringArray(R.array.mp1_rdbtn1);
        Str1 = getResources().getStringArray(R.array.mp1_rdbtn2);
        Str1 = getResources().getStringArray(R.array.mp1_rdbtn3);
        //Log.d("hieorek",Str1[0]);
        //story.add(getResources().getString(R.string.mp1_btn1)); //쇠창살
        //story.add(getResources().getString(R.string.mp1_btn2)); //주머니
        //story.add(getResources().getString(R.string.mp1_btn3)); //무리

        int r = rs.nextInt(3);
        int r1 = rs.nextInt(2);
        if (r == 0 && r1 == 0) {
            btn_rd1.setText(Str1.toString());
            btn_rd1 = findViewById(R.id.btn1);
            story.remove(r);
            btn_rd2.setText(story.get(r1));
            btn_rd2 = findViewById(R.id.btn2);
            story.remove(r1);
            btn_rd3.setText(story.get(0));
            btn_rd3 = findViewById(R.id.btn3);
        } else if (r == 0 && r1 == 1) {
            btn_rd1.setText(story.get(r));
            btn_rd1 = findViewById(R.id.btn1);
            story.remove(r);
            btn_rd2.setText(story.get(r1));
            btn_rd2 = findViewById(R.id.btn3);
            story.remove(r1);
            btn_rd3.setText(story.get(0));
            btn_rd3 = findViewById(R.id.btn2);

        } else if (r == 1 && r1 == 0) {
            btn_rd1.setText(story.get(r));
            btn_rd1 = findViewById(R.id.btn2);
            story.remove(r);
            btn_rd2.setText(story.get(r1));
            btn_rd2 = findViewById(R.id.btn1);
            story.remove(r1);
            btn_rd3.setText(story.get(0));
            btn_rd3 = findViewById(R.id.btn3);
        } else if (r == 2 && r1 == 0) {
            btn_rd1.setText(story.get(r));
            btn_rd1 = findViewById(R.id.btn2);
            story.remove(r);
            btn_rd2.setText(story.get(r1));
            btn_rd2 = findViewById(R.id.btn3);
            story.remove(r1);
            btn_rd3.setText(story.get(0));
            btn_rd3 = findViewById(R.id.btn1);

        } else if (r == 1 && r1 == 1) {
            btn_rd1.setText(story.get(r));
            btn_rd1 = findViewById(R.id.btn3);//무리 쇠창살 주머니 : 주머니 무리 쇠창살
            story.remove(r);
            btn_rd2.setText(story.get(r1));
            btn_rd2 = findViewById(R.id.btn1);
            story.remove(r1);
            btn_rd3.setText(story.get(0));
            btn_rd3 = findViewById(R.id.btn2);

        } else if (r == 2 && r1 == 1) {
            btn_rd1.setText(story.get(r));
            btn_rd1 = findViewById(R.id.btn3);
            story.remove(r);
            btn_rd2.setText(story.get(r1));
            btn_rd2 = findViewById(R.id.btn2);
            story.remove(r1);
            btn_rd3.setText(story.get(0));
            btn_rd3 = findViewById(R.id.btn1);
        }


            btn_rd1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), MainPage1_button1.class);
                    startActivity(intent);
                }
            });

            btn_rd2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), MainPage1_button2.class);
                    startActivity(intent);
                }
            });

            btn_rd3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), MainPage1_button3.class);
                    startActivity(intent);
                }
            });

        }
    }