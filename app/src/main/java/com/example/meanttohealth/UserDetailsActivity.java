package com.example.meanttohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UserDetailsActivity extends AppCompatActivity {
     Button userBtn1;
     database mydb;
     TextView UsertextView1,UsertextView2,UsertextView3,UsertextView4;
     EditText etdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        userBtn1=findViewById(R.id.userBtn1);

       // String username=getIntent().getStringExtra("name");
        UsertextView1=findViewById(R.id.UsertextView1);
        UsertextView2=findViewById(R.id.UsertextView2);
        UsertextView3=findViewById(R.id.UsertextView3);
        UsertextView4=findViewById(R.id.UsertextView4);

        userBtn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String username=etdata.getText().toString();
                 Cursor result= mydb.readData(username);
                 if(result.getCount()==0){
                     Toast.makeText(UserDetailsActivity.this, "not fetched", Toast.LENGTH_SHORT).show();
                 }
                 else {
                     if (result.moveToNext()) {
                         String name1 = result.getString(1);
                         String Email1 = result.getString(2);
                         String username1 = result.getString(3);
                         String passWord1 = result.getString(4);

                         UsertextView1.setText(name1);
                         UsertextView2.setText(Email1);
                         UsertextView3.setText(username1);
                         UsertextView4.setText(passWord1);
                     }
                 }
            }
        });
    }


}