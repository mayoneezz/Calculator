package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    public void plusFunction(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);
        if(firstNum.getText().toString().isEmpty()||secondNum.getText().toString().isEmpty()){
            return;
        }
        double result = (Double.parseDouble(firstNum.getText().toString()))+
                (Double.parseDouble(secondNum.getText().toString()));
        goToActivity(""+result);
    }

    public void minusFunction(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);
        if(firstNum.getText().toString().isEmpty()||secondNum.getText().toString().isEmpty()){
            return;
        }
        double result = (Double.parseDouble(firstNum.getText().toString()))-
                (Double.parseDouble(secondNum.getText().toString()));
        goToActivity(""+result);
    }

    public void multiplyFunction(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);
        if(firstNum.getText().toString().isEmpty()||secondNum.getText().toString().isEmpty()){
            return;
        }
        double result = (Double.parseDouble(firstNum.getText().toString()))*
                (Double.parseDouble(secondNum.getText().toString()));
        goToActivity(""+result);
    }

    public void divideFunction(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);
        if(firstNum.getText().toString().isEmpty()||secondNum.getText().toString().isEmpty()){
            return;
        }
        double result = (Double.parseDouble(firstNum.getText().toString()))/
                (Double.parseDouble(secondNum.getText().toString()));
        goToActivity(""+result);
    }


    public void goToActivity(String s){
        //Log.i("INFO","Button Pressed");
        Intent intent = new Intent(this,CalculatorActivity2.class);
        intent.putExtra("result",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }
}