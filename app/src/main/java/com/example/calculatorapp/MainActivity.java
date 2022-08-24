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
        //try catch block to prevent crashes if the item the user entered is not an integer
        try {
            num1 = Integer.parseInt((number1ET.getText().toString()));
            numberSumTV.setText("" + num1);
            num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 + num2;
            numberSumTV.setText("" + numberSumTV.getText() + " + " + num2);

            numberSumTV.setText("" + numberSumTV.getText() + " = " + sum);
        }
        catch(NumberFormatException e){
            numberSumTV.setText("You didn't enter a number! Try again.");
            }

    }

    public void findDiff(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberDiffTV = findViewById(R.id.resultTV);
        int num1;
        int num2;
        //try catch block to prevent crashes if the item the user entered is not an integer
        try {
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            int diff = num1 - num2;

            numberDiffTV.setText("" + diff);
        }
        catch(NumberFormatException e){
            numberDiffTV.setText("You didn't enter a number! Try again.");
        }

    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberProdTV = findViewById(R.id.resultTV);
        int num1;
        int num2;
        //try catch block to prevent crashes if the item the user entered is not an integer
        try {
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            int prod = num1 * num2;

            numberProdTV.setText("" + prod);
        }
        catch(NumberFormatException e){
            numberProdTV.setText("You didn't enter a number! Try again.");
        }
    }
    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberQuotientTV = findViewById(R.id.resultTV);
        int num1;
        int num2;
        //try catch block to prevent crashes if the item the user entered is not an integer
        try {
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            int quotient = num1 / num2;

            numberQuotientTV.setText("" + quotient);
        }
        catch(NumberFormatException e){
            numberQuotientTV.setText("You didn't enter a number! Try again.");
        }
    }

    public void findFactorial(View view) {
        //calculates the factorial of the number given
        EditText number1ET = findViewById(R.id.num1ET);
        TextView numberFactorialTV = findViewById(R.id.resultTV);
        int num;
        int factorial;
        //try catch block to prevent crashes if the item the user entered is not an integer
        try {
            factorial = Integer.parseInt((number1ET.getText().toString()));
            num = 1; //starting from 1
            for(int i = factorial; i > 0; i--){
                //the num entered, factorial, is the beginning num. for each iteration of the loop, it is multiplied
                //by the number with a value of 1 less
                num *= i;
            }
            factorial = num;
            numberFactorialTV.setText("" + factorial);
        }
        catch(NumberFormatException e){
            numberFactorialTV.setText("You didn't enter a number! Try again.");
        }


    }

    public void findExponent(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberExpTV = findViewById(R.id.resultTV);
        int num1;
        int num2;
        //try catch block to prevent crashes if the item the user entered is not an integer
        try {
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            int exp = 1;
            for(int i = 0; i < num2; i++){
                exp = exp * num1;
            }

            numberExpTV.setText("" + exp);
        }
        catch(NumberFormatException e){
            numberExpTV.setText("You didn't enter a number! Try again.");
        }

    }
}