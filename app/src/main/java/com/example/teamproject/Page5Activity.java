package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.teamproject.Page1Activity;
import com.example.teamproject.R;

public class Page5Activity extends Activity {

    Button btn_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page5);

        btn_sub = findViewById(R.id.btn3);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
