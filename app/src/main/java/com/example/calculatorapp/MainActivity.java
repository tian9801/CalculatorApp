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
        //calculates sum of num1 and num2
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        int num1;
        int num2;
        //try catch block to prevent crashes if the item the user entered is not an integer
        try {
            //check if entered values are ints
            num1 = Integer.parseInt((number1ET.getText().toString()));
            numberSumTV.setText("" + num1);
            num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 + num2;
            numberSumTV.setText("" + numberSumTV.getText() + " + " + num2);
            //adds onto message to display the calculated equation at the end
            numberSumTV.setText("" + numberSumTV.getText() + " = " + sum);
        }
        catch(NumberFormatException e){
            numberSumTV.setText("You didn't enter a number! Try again.");
            }

    }

    public void findDiff(View view) {
        //calculates difference of num1 and num2
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberDiffTV = findViewById(R.id.resultTV);
        int num1;
        int num2;
        //try catch block to prevent crashes if the item the user entered is not an integer
        try {
            //check if entered values are ints
            num1 = Integer.parseInt((number1ET.getText().toString()));
            numberDiffTV.setText("" + num1);
            num2 = Integer.parseInt((number2ET.getText().toString()));
            numberDiffTV.setText("" + numberDiffTV.getText() + " - " + num2);
            int diff = num1 - num2;

            numberDiffTV.setText("" + numberDiffTV.getText() + " = " + diff);
            //displays equation calculated at the end
        }
        catch(NumberFormatException e){
            numberDiffTV.setText("You didn't enter a number! Try again.");
        }

    }

    public void findProduct(View view) {
        //calculates product of num1 and num2
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberProdTV = findViewById(R.id.resultTV);
        int num1;
        int num2;
        //try catch block to prevent crashes if the item the user entered is not an integer
        try {
            //check if entered values are ints
            num1 = Integer.parseInt((number1ET.getText().toString()));
            numberProdTV.setText("" + num1);
            num2 = Integer.parseInt((number2ET.getText().toString()));
            numberProdTV.setText("" + numberProdTV.getText() + " x " + num2);
            int prod = num1 * num2;

            numberProdTV.setText("" + numberProdTV.getText() + " = " + prod);
            //displays final equation calculated
        }
        catch(NumberFormatException e){
            numberProdTV.setText("You didn't enter a number! Try again.");
        }
    }
    public void findQuotient(View view) {
        //calculates quotient of num1 and num2
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberQuotientTV = findViewById(R.id.resultTV);
        int num1;
        int num2;
        //try catch block to prevent crashes if the item the user entered is not an integer
        try {
            //check if entered values are ints
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            int quotient = num1 / num2;

            numberQuotientTV.setText("" + num1 + " ÷ " + num2 + " = " + quotient);
        }
        catch(NumberFormatException e){
            numberQuotientTV.setText("You didn't enter a number! Try again.");
        }
    }

    public void findFactorial(View view) {
        //calculates the factorial of the number given in slot 1
        EditText number1ET = findViewById(R.id.num1ET);
        TextView numberFactorialTV = findViewById(R.id.resultTV);
        int original;
        int num;
        int factorial;
        //try catch block to prevent crashes if the item the user entered is not an integer
        try {
            //check if entered values are ints
            factorial = Integer.parseInt((number1ET.getText().toString()));
            original = factorial;
            num = 1; //starting from 1
            for(int i = factorial; i > 0; i--){
                //the num entered, factorial, is the beginning num. for each iteration of the loop, it is multiplied
                //by the number with a value of 1 less
                num *= i;
            }
            factorial = num;
            numberFactorialTV.setText("" + original + "! = " + factorial);
            //displays full calculation
        }
        catch(NumberFormatException e){
            numberFactorialTV.setText("You didn't enter a number! Try again.");
        }


    }

    public void findExponent(View view) {
        //calculates num1 raised to the power of num2
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberExpTV = findViewById(R.id.resultTV);
        int num1;
        int num2;
        //try catch block to prevent crashes if the item the user entered is not an integer
        try {
            //check if entered values are ints
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            int exp = 1;
            for(int i = 0; i < num2; i++){
                exp = exp * num1;
            }

            numberExpTV.setText("" + num1 + "^" + num2 + " = " + exp);
        }
        catch(NumberFormatException e){
            numberExpTV.setText("You didn't enter a number! Try again.");
        }

    }
}