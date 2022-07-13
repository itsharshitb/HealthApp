package com.example.meanttohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HeartDocters extends AppCompatActivity {
  TextView d1textView,d2textView,d3textView,d4textView;
  Button d1Button,d2Button,d3Button,d4Button, e1Button,e2Button,e3Button,e4Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_docters);
        //-----------------------------------texts
        d1textView=findViewById(R.id.d1textView);
        d2textView=findViewById(R.id.d2textView);
        d3textView=findViewById(R.id.d3textView);
        d4textView=findViewById(R.id.d4textView);

        //-----------------------------------buttons
        d1Button=findViewById(R.id.d1button);
        d2Button=findViewById(R.id.d2button);
        d3Button=findViewById(R.id.d3button);
        d4Button=findViewById(R.id.d4button);
        e1Button=findViewById(R.id.e1Button);
        e2Button=findViewById(R.id.e2Button);
        e3Button=findViewById(R.id.e3Button);
        e4Button=findViewById(R.id.e4Button);

        //----------------------------------
        d1textView.setText("Dr. Ishmit Negi \nM.B.B.S   M.D \nHeart Specialist \nYour Health is Our Priority.");
        d2textView.setText("Dr. Devika\nM.B.B.S   M.D \nHeart Specialist \nour body gift's god");
        d3textView.setText("Dr. Deepak Kumar \nM.B.B.S  M.S \n Heart Surgeon \nWe are here for you.");
        d4textView.setText("Dr. ANkita Yadav \nM.B.B.S  M.S \n Heart Surgeon \nYour body is precious.");


        e1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HeartDocters.this,EmailActivity.class);
                startActivity(intent);
            }
        });

        e2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HeartDocters.this,EmailActivity.class);
                startActivity(intent);
            }
        });

        e3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HeartDocters.this,EmailActivity.class);
                startActivity(intent);
            }
        });

        e4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HeartDocters.this,EmailActivity.class);
                startActivity(intent);
            }
        });
    }
}