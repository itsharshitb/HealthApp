package com.example.meanttohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SelectDocterCatogary extends AppCompatActivity {

    TextView text;
    ImageButton heartButton,generalButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_docter_catogary);

                heartButton=findViewById(R.id.heartButton);
                generalButton=findViewById(R.id.generalButton);



        heartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectDocterCatogary.this,HeartDocters.class);
                startActivity(intent);
            }
        });

        generalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectDocterCatogary.this,HeartDocters.class);
                startActivity(intent);
            }
        });
    }
}