package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainPage1_buttons extends Activity {

    Button btn_sub1;
    Button btn_sub2;
    Button btn_sub3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage1_buttons);
        Random rs = new Random();

        btn_sub1 = findViewById(R.id.btn1);
        btn_sub2 = findViewById(R.id.btn2);
        btn_sub3 = findViewById(R.id.btn3);

        List<String> story = new ArrayList<>();

        story.add(getResources().getString(R.string.mp1_btn1)); //쇠창살
        story.add(getResources().getString(R.string.mp1_btn2)); //주머니
        story.add(getResources().getString(R.string.mp1_btn3)); //무리

        int r = rs.nextInt(3);
        int r1 = rs.nextInt(2);
        if (r == 0 && r1 == 0) {
            btn_sub1.setText(story.get(r));
            btn_sub1 = findViewById(R.id.btn1);
            story.remove(r);
            btn_sub2.setText(story.get(r1));
            btn_sub2 = findViewById(R.id.btn2);
            story.remove(r1);
            btn_sub3.setText(story.get(0));
            btn_sub3 = findViewById(R.id.btn3);
        } else if (r == 0 && r1 == 1) {
            btn_sub1.setText(story.get(r));
            btn_sub1 = findViewById(R.id.btn1);
            story.remove(r);
            btn_sub2.setText(story.get(r1));
            btn_sub2 = findViewById(R.id.btn3);
            story.remove(r1);
            btn_sub3.setText(story.get(0));
            btn_sub3 = findViewById(R.id.btn2);

        } else if (r == 1 && r1 == 0) {
            btn_sub1.setText(story.get(r));
            btn_sub1 = findViewById(R.id.btn2);
            story.remove(r);
            btn_sub2.setText(story.get(r1));
            btn_sub2 = findViewById(R.id.btn1);
            story.remove(r1);
            btn_sub3.setText(story.get(0));
            btn_sub3 = findViewById(R.id.btn3);
        } else if (r == 2 && r1 == 0) {
            btn_sub1.setText(story.get(r));
            btn_sub1 = findViewById(R.id.btn2);
            story.remove(r);
            btn_sub2.setText(story.get(r1));
            btn_sub2 = findViewById(R.id.btn3);
            story.remove(r1);
            btn_sub3.setText(story.get(0));
            btn_sub3 = findViewById(R.id.btn1);

        } else if (r == 1 && r1 == 1) {
            btn_sub1.setText(story.get(r));
            btn_sub1 = findViewById(R.id.btn3);//무리 쇠창살 주머니 : 주머니 무리 쇠창살
            story.remove(r);
            btn_sub2.setText(story.get(r1));
            btn_sub2 = findViewById(R.id.btn1);
            story.remove(r1);
            btn_sub3.setText(story.get(0));
            btn_sub3 = findViewById(R.id.btn2);

        } else if (r == 2 && r1 == 1) {
            btn_sub1.setText(story.get(r));
            btn_sub1 = findViewById(R.id.btn3);
            story.remove(r);
            btn_sub2.setText(story.get(r1));
            btn_sub2 = findViewById(R.id.btn2);
            story.remove(r1);
            btn_sub3.setText(story.get(0));
            btn_sub3 = findViewById(R.id.btn1);
        }


            btn_sub1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), MainPage1_button1.class);
                    startActivity(intent);
                }
            });

            btn_sub2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), MainPage1_button2.class);
                    startActivity(intent);
                }
            });

            btn_sub3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), MainPage1_button3.class);
                    startActivity(intent);
                }
            });

        }
    }