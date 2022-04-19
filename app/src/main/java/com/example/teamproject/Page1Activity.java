package com.example.teamproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Page1Activity extends Activity {

    Button btn_sub2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);

        btn_sub2 = findViewById(R.id.btn3);

        btn_sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Page2Activity.class);
                startActivity(intent);
            }
        });

    }
}
