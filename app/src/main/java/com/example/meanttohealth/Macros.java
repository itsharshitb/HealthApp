package com.example.meanttohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Macros extends AppCompatActivity implements OnClickListener {

    EditText ageInput;
    EditText heightInput;
    EditText weightInput;

    Button cutButton;
    Button maintButton;
    Button bulkButton;

    TextView displayValue;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macros);

        // Find elements from the layout and Define them
        ageInput =  findViewById(R.id.ageInput);
        heightInput = findViewById(R.id.heightInput);
        weightInput =  findViewById(R.id.weightInput);

        cutButton = findViewById(R.id.cutButton);
        maintButton = findViewById(R.id.maintButton);
        bulkButton =  findViewById(R.id.bulkButton);

        displayValue = findViewById(R.id.displayValue);

        //Set button listeners
        cutButton.setOnClickListener(this);
        maintButton.setOnClickListener(this);
        bulkButton.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        int ageNum ;
        int weightNum;
        int heightNum;
        int result = 0;
        int calculate;
        int percentAdd;

        // Test to see if fields are empty
        if (TextUtils.isEmpty(ageInput.getText().toString())
                || TextUtils.isEmpty(heightInput.getText().toString())
                || TextUtils.isEmpty(weightInput.getText().toString())) {
            return;
        }

        // This is to read the Edit Text fields from the layout and fill the Variables with Numbers
        ageNum =  Integer.parseInt(ageInput.getText().toString());
        weightNum = Integer.parseInt(weightInput.getText().toString());
        heightNum = Integer.parseInt(heightInput.getText().toString());

        //Defines which button has been clicked and will calculate accordingly
        switch (v.getId()) {
            case R.id.cutButton:
                calculate = (10*weightNum) + (6*heightNum) - (5*ageNum) + 5;
                percentAdd =  (calculate*1);
                result = calculate + percentAdd;
                break;
            case R.id.maintButton:
                calculate = (10*weightNum) + (6*heightNum) - (5*ageNum) + 5;
                percentAdd =  (calculate*1);
                result = calculate + percentAdd;
                break;
            case R.id.bulkButton:
                calculate = (10*weightNum) + (6*heightNum) - (5*ageNum) + 5;
                percentAdd = (calculate*1);
                result = calculate + percentAdd;
                break;
            default:
                break;
        }

        //Displays the output
        displayValue.setText(String.valueOf(result));
    }
}