package com.example.meanttohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView7;
    ImageView imageView1;
    Button loginButton,signupButton;
    EditText etUsername,etPassword,etEmail,etPersonName;
    database g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // all variable finding .........
        textView1=findViewById(R.id.textView1l);
        textView2=findViewById(R.id.textView2l);
        textView3=findViewById(R.id.textView3);
        textView7=findViewById(R.id.textView7l);
        imageView1=findViewById(R.id.imageView1l);
//        loginButton=findViewById(R.id.loginButtonl);
        signupButton=findViewById(R.id.signupButton);
//        etUsername=findViewById(R.id.etUsername);
//        etPassword=findViewById(R.id.etPasswordl);
//        etEmail=findViewById(R.id.etEmail);
//        etPersonName=findViewById(R.id.etUserNamel);

        textView1.setText("Patient Care 360");
        textView2.setText(" Hello!");
//        textView3.setText("         Already a Customer ?");
//        textView7.setText("enter your details to sign up.");

//        etUsername.setText("");
//        etPersonName.setText("");
//        etPassword.setText("");
//        etEmail.setText("");
//        loginButton.setOnClickListener(v -> {
//            Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
//            startActivity(intent);
//
//        });

//         g=new database(this);
         // SQLiteDatabase db=g.getReadableDatabase();

        signupButton.setOnClickListener(v -> {

            Intent intent=new Intent(getApplicationContext(),HomeActivity.class);
            intent.putExtra("name","User");
            startActivity(intent);
//                    String username = etUsername.getText().toString();
//                    String name = etPersonName.getText().toString();
//                    String password = etPassword.getText().toString();
//                    String mail = etEmail.getText().toString();
//
//                    if (username.equals("") || name.equals("") || password.equals("") || mail.equals("")) {
//                        Toast.makeText(MainActivity.this, "Please Enter all the fields", Toast.LENGTH_SHORT).show();
//                    } else {
//                        boolean checkuser = g.checkusername(username);
//                        if (checkuser==false) {
//                            boolean i = g.insert_data(name, mail, username, password);
//                            if (i) {
//                                Toast.makeText(MainActivity.this, "Signup successfull .", Toast.LENGTH_SHORT).show();
//                                Intent intent=new Intent(getApplicationContext(),HomeActivity.class);
//                                intent.putExtra("name",username);
//                                startActivity(intent);
//                            } else {
//                                Toast.makeText(MainActivity.this, "SignUp failed Please try again in sometime", Toast.LENGTH_SHORT).show();
//                            }
//                        } else {
//                            Toast.makeText(this, "user already exist", Toast.LENGTH_SHORT).show();
//                        }
//                    }
        });
    }
}