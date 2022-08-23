package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        int num1;
        int num2;
        try {
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 + num2;

            numberSumTV.setText("" + sum);
        }
        catch(NumberFormatException e){
            numberSumTV.setText("You didn't enter a number");
            }

    }

    public void findDiff(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberDiffTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int difference = num1 - num2;

        numberDiffTV.setText("" + difference);
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberProdTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int product = num1 * num2;

        numberProdTV.setText("" + product);
    }
    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberQuotientTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        double quotient = num1 / num2;

        numberQuotientTV.setText("" + quotient);
    }

    public void findFactorial(View view) {
        //calculates the factorial of the number given
        EditText number1ET = findViewById(R.id.num1ET);
        TextView numberFactorialTV = findViewById(R.id.resultTV);

        int factorial = Integer.parseInt((number1ET.getText().toString()));
        int num = 1; //starting from 1
        for(int i = factorial; i > 0; i--){
            //the num entered, factorial, is the beginning num. for each iteration of the loop, it is multiplied
            //by the number with a value of 1 less
            num *= i;
        }
        factorial = num;
        numberFactorialTV.setText("" + factorial);
    }

    public void findExponent(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberExpTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int exp = 1;
        for(int i = 0; i < num2; i++){
            exp = exp * num1;
        }

        numberExpTV.setText("" + exp);
    }
}