package com.example.meanttohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
     TextView htextView,htextView2;
     ImageButton bmiButton,AmbulanceButton,nutrients,docterDetails,diseaseButton,hospitalButton;
     ImageView hImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        htextView=findViewById(R.id.htextView);
        htextView2=findViewById(R.id.htextView2);
        bmiButton=findViewById(R.id.bmiButton);
        docterDetails=findViewById(R.id.DocterDetails);
        AmbulanceButton=findViewById(R.id.AmbulanceButton);
        nutrients=findViewById(R.id.nutrients);
        hImageView=findViewById(R.id.hImageView);
        diseaseButton=findViewById(R.id.diseaseButton);
        hospitalButton=findViewById(R.id.hospitalButton);
        htextView.setText("Hello!");


        String name=getIntent().getStringExtra("name");

       htextView2.setText(name);
        //-------------------------------------
        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent=new Intent(HomeActivity.this,BmiActivity.class);
             startActivity(intent);
            }
        });

        //-----------------------------------
        AmbulanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:102"));
                startActivity(intent);
            }
        });
       //------------------------------------
        nutrients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,Macros.class);
                startActivity(intent);
            }
        });

        docterDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,SelectDocterCatogary.class);
                startActivity(intent);
            }
        });

        diseaseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.aarogyasetu.gov.in/"));
                startActivity(intent);


            }
        });

        hospitalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,NearByPlaces.class);
                startActivity(intent);
            }
        });

        hImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent=new Intent(HomeActivity.this,UserDetailsActivity.class);
             intent.putExtra("name",name);
             startActivity(intent);
            }
        });


    }
}