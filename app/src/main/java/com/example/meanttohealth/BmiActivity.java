package com.example.meanttohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiActivity extends AppCompatActivity {

    EditText etWeight;
    EditText etHeight;
    Button btnBmi;
    TextView weightTextView,heightTextView,tvResult,bmiTextView;
     String resulttext;
    double weight,height;
     double bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        weightTextView=findViewById(R.id.weightTextView);
        heightTextView=findViewById(R.id.heightTextView);
        bmiTextView=findViewById(R.id.bmiTextView);

        weightTextView.setText("Enter Your Weight in KG");
        heightTextView.setText("Enter Your  Height in CM");
        bmiTextView.setText("BMI CALCULATOR");
        initControls();

     /*   private void initControls() {
            etHeight = (EditText)findViewById(R.id.etHeight);
            etWeight = (EditText)findViewById(R.id.etWeight);
            tvResult = (TextView)findViewById(R.id.tvResult);
            btnBmi = (Button)findViewById(R.id.btnBmi);
            //btnreset = (Button)findViewById(R.id.btnreset);
            btnBmi.setOnClickListener(new Button.OnClickListener() { public void onClick (View v){ calculate(); }});
            //btnreset.setOnClickListener(new Button.OnClickListener() { public void onClick (View v){ reset(); }});
        } */
      /*  weight=Integer.parseInt(etWeight.getText().toString());
        height=Integer.parseInt(etHeight.getText().toString());

        result= (int) ((weight*703*2.2046)/((height*height)/2.54)); */

    }

    private void initControls() {
        etHeight = (EditText)findViewById(R.id.etHeight);
        etWeight = (EditText)findViewById(R.id.etWeight);
        tvResult = (TextView)findViewById(R.id.tvResult);
        btnBmi = (Button)findViewById(R.id.btnBmi);
        //btnreset = (Button)findViewById(R.id.btnreset);
        btnBmi.setOnClickListener(new Button.OnClickListener() { public void onClick (View v){ calculate(); }});
        //btnreset.setOnClickListener(new Butt

    }


    private void calculate()    {
        height =Double.parseDouble(etHeight.getText().toString());
        weight =Double.parseDouble(etWeight.getText().toString());
        height=height/100;
        bmi = ((weight)/(height * height));
        //txttipamount.setText(Double.toString(bmi));
        if (bmi >= 30) { /* obese */
            resulttext = "Your BMI of " + Double.toString(bmi) + " is OBESE.";
            tvResult.setText(resulttext);
        } else if (bmi >= 25) {
            resulttext = "Your BMI of " + Double.toString(bmi) + " is OVERWEIGHT.";
            tvResult.setText(resulttext);
        } else if (bmi >= 18.5) {
            resulttext = "Your BMI of " + Double.toString(bmi) + " is IDEAL.";
            tvResult.setText(resulttext);
        } else {
            resulttext = "Your BMI of " + Double.toString(bmi) + " is UNDERWEIGHT.";
            tvResult.setText(resulttext);
        }
    }

    private void reset()
    {
        tvResult.setText("Your BMI is unknown.");
        etHeight.setText("0");
        etWeight.setText("0");
    }
}