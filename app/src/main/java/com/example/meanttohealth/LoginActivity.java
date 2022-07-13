package com.example.meanttohealth;

import static com.example.meanttohealth.R.layout.activity_login;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
     TextView textView1l,textView7l,textView2l;
     EditText etUserNamel,etPasswordl;
     Button loginButtonl;
     database db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

         db=new database(this);


        textView2l=findViewById(R.id.textView2l);
        textView7l=findViewById(R.id.textView7l);

        etUserNamel=findViewById(R.id.etUserNamel);
        etPasswordl=findViewById(R.id.etPasswordl);
        loginButtonl=findViewById(R.id.loginButtonl);

        etUserNamel.setText("");
        etPasswordl.setText("");

        textView2l.setText("Hello !");
        textView7l.setText("Enter your Details.");

        loginButtonl.setOnClickListener(v -> {

            String username=etUserNamel.getText().toString();
            String password=etPasswordl.getText().toString();


            if(username.equals("")||password.equals("")){
                Toast.makeText(LoginActivity.this, "please enter all fields", Toast.LENGTH_SHORT).show();
            }
            else {
                boolean checkuser = db.checkusernamepassword(username,password);
                if(checkuser==true){
                    Toast.makeText(LoginActivity.this, "sign in succesfull", Toast.LENGTH_SHORT).show();
                   Intent intent=new Intent(LoginActivity.this,HomeActivity.class);
                   intent.putExtra("name",username);
                   startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this, "invalid credential", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}