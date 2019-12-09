package com.example.therealcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView calculatorText;

    private final int ADDITION = 707;
    private final int SUBTRACTION = 1;
    private final int MULTIPLICATION = 2;

    private int valueHolder = -1;

    private int operator =-1;


    private static final String TAG = "MainActivity";
    /*
    * onCreate() - Activity is actually being created
    * onStart() - activity is being called to the foreground
    * onResume() - activity is actually visible to the user at this point
    * onPause() - activity is partially visible
    * onStop() - activity is no longer visible to the user
    * onRestart()
    * onDestroy() - Activity has been destroyed
    *
    * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate()");

        calculatorText = findViewById(R.id.my_textview);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart()");
    }


    public void onButtonClick(View view){
        String newText = "";

        switch (view.getId()){
            case R.id.one_button:
                newText = calculatorText.getText().toString().trim()+1;
                calculatorText.setText(newText);
                break;
            case R.id.two_button:
                newText = calculatorText.getText().toString().trim()+2;
                calculatorText.setText(newText);
                break;
            case R.id.three_button:
                newText = calculatorText.getText().toString().trim()+3;
                calculatorText.setText(newText);
                break;
            case R.id.four_button:
                newText = calculatorText.getText().toString().trim()+4;
                calculatorText.setText(newText);
                break;
            case R.id.five_button:
                newText = calculatorText.getText().toString().trim()+5;
                calculatorText.setText(newText);
                break;
            case R.id.six_button:
                newText = calculatorText.getText().toString().trim()+6;
                calculatorText.setText(newText);
                break;
            case R.id.seven_button:
                newText = calculatorText.getText().toString().trim()+7;
                calculatorText.setText(newText);
                break;
            case R.id.eight_button:
                newText = calculatorText.getText().toString().trim()+8;
                calculatorText.setText(newText);
                break;
            case R.id.nine_button:
                newText = calculatorText.getText().toString().trim()+9;
                calculatorText.setText(newText);
                break;
            case R.id.zero_button:
                newText = calculatorText.getText().toString().trim();
                if(!newText.equals("0"))
                {     newText = newText+0;
                calculatorText.setText(newText);
                }
                break;
                //Clearing the textfield
            case R.id.ac_button:
                calculatorText.setText("0");
                break;

            case R.id.addition_button:
                valueHolder = Integer.parseInt(calculatorText.getText().toString());
                operator = ADDITION;
                calculatorText.setText("0");
                break;

            case R.id.equals_button:
                int current = Integer.parseInt(calculatorText.getText().toString());
                calculate(operator, current);
                break;
            case R.id.cos_button:
                double cosValue = Math.cos((double) Integer.parseInt(calculatorText.getText().toString()));
                calculatorText.setText(cosValue+"");
                break;



        }

        newText = "";
    }

    private void calculate(int operator, int secondValue){
        switch(operator){
            case ADDITION:
                    int ans = valueHolder + secondValue;
                    calculatorText.setText(ans+"");
                    valueHolder = 0;
                break;
            case MULTIPLICATION:
                //TODO
                break;
        }
    }
}
