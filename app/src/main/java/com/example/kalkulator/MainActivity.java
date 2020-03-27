package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double ValueOne, ValueTwo;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, dot, equals, to3, sqrt, to2, div, ac, sil, per, plus, min, sign, log, mul;
    TextView textDown, textUp;
    int op;
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("tekstDolny",textDown.getText().toString());
        outState.putString("tekstGorny",textUp.getText().toString());
        outState.putInt("opNumber",op);
        outState.putDouble("valueOne",ValueOne);
        outState.putDouble("valueTwo",ValueTwo);

    }
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        textDown.setText(savedInstanceState.getString("tekstDolny"));
        textUp.setText(savedInstanceState.getString("tekstGorny"));
        op=savedInstanceState.getInt("opNumber");
        ValueOne=savedInstanceState.getDouble("valueOne");
        ValueTwo=savedInstanceState.getDouble("valueTwo");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = findViewById(R.id.button0);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        dot = findViewById(R.id.dot);
        equals = findViewById(R.id.buttonEquals);
        to3 = findViewById(R.id.button33);
        sqrt = findViewById(R.id.buttonSqrt);
        to2 = findViewById(R.id.buttonSQUARE);
        div = findViewById(R.id.buttonDivide);
        ac = findViewById(R.id.buttonAC);
        sil = findViewById(R.id.buttonSIL);
        per = findViewById(R.id.buttonPercent);
        plus = findViewById(R.id.buttonPlus);
        min = findViewById(R.id.buttonMinus);
        sign = findViewById(R.id.buttonPlusMinus);
        log = findViewById(R.id.buttonLog);
        mul = findViewById(R.id.buttonMultiply);
        textDown = findViewById(R.id.numberTextView);
        textUp = findViewById(R.id.secondNumber);
        portraitButtons();
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            landscapeButtons();
        }
    }

    private void portraitButtons() {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textDown.getText().toString().equals("0")) {
                    textDown.setText("1");
                } else {
                    textDown.append("1");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textDown.getText().toString().equals("0")) {
                    textDown.setText("2");
                } else {
                    textDown.append("2");
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textDown.getText().toString().equals("0")) {
                    textDown.setText("3");
                } else {
                    textDown.append("3");
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textDown.getText().toString().equals("0")) {
                    textDown.setText("4");
                } else {
                    textDown.append("4");
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textDown.getText().toString().equals("0")) {
                    textDown.setText("5");
                } else {
                    textDown.append("5");
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textDown.getText().toString().equals("0")) {
                    textDown.setText("6");
                } else {
                    textDown.append("6");
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textDown.getText().toString().equals("0")) {
                    textDown.setText("7");
                } else {
                    textDown.append("7");
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textDown.getText().toString().equals("0")) {
                    textDown.setText("8");
                } else {
                    textDown.append("8");
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textDown.getText().toString().equals("0")) {
                    textDown.setText("9");
                } else {
                    textDown.append("9");
                }
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textDown.getText().toString().equals("0")) {
                    textDown.append("0");
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                equals.setClickable(true);
                ValueOne = Double.parseDouble(textDown.getText().toString());
                textUp.setText(ValueOne +" + ");
                textDown.setText("0");
                op=1;
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                equals.setClickable(true);
                ValueOne = Double.parseDouble(textDown.getText().toString());
                textUp.setText(ValueOne +" - ");
                textDown.setText("0");
                op=2;
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                equals.setClickable(true);
                ValueOne = Double.parseDouble(textDown.getText().toString());
                textUp.setText(ValueOne +" * ");
                textDown.setText("0");
                op=3;
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                equals.setClickable(true);
                ValueOne = Double.parseDouble(textDown.getText().toString());
                textUp.setText(ValueOne +" / ");
                textDown.setText("0");
                op=4;
            }
        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textDown.getText().toString().equals("0")) {
                    ValueOne = Double.parseDouble(textDown.getText().toString()) * (-1);
                    textDown.setText(String.valueOf(ValueOne));
                }
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                equals.setClickable(false);
                ValueTwo = Double.parseDouble(textDown.getText().toString());
                if (op==1) {
                    textUp.append(ValueTwo+"=");
                    textDown.setText(String.valueOf(ValueOne + ValueTwo));
                }
                if (op==2) {
                    textUp.append(ValueTwo+"=");
                    textDown.setText(String.valueOf(ValueOne - ValueTwo));
                }

                if (op==3) {
                    textUp.append(ValueTwo+"=");
                    textDown.setText(String.valueOf(ValueOne *ValueTwo));
                }

                if (op==4) {
                    textUp.append(ValueTwo+"=");
                    textDown.setText(String.valueOf(ValueOne / ValueTwo));
                }
                if (op==5) {
                    textUp.append(ValueTwo+"=");
                    textDown.setText(String.valueOf(ValueOne % ValueTwo));
                }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDown.setText("0");
                textUp.setText("");
                op=0;
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textDown.getText().toString().contains(".")) {
                    textDown.append(".");
                }
            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                equals.setClickable(true);
                ValueOne = Double.parseDouble(textDown.getText().toString());
                op = 5;
                textUp.setText(ValueOne +"%");
                textDown.setText("0");
            }
        });


    }
    private void landscapeButtons(){
        to2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(textDown.getText().toString());
                textUp.setText(ValueOne+"^2");
                textDown.setText(String.valueOf(ValueOne * ValueOne));

            }
        });
        to3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(textDown.getText().toString());
                textUp.setText(ValueOne+"^3");
                textDown.setText(String.valueOf(Math.pow(ValueOne, 3)));
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(textDown.getText().toString());
                textUp.setText("sqrt("+ ValueOne +")");
                textDown.setText(String.valueOf(Math.sqrt(ValueOne)));
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(textDown.getText().toString());
                textUp.setText("log10("+ ValueOne +")");
                textDown.setText(String.valueOf(Math.log10(ValueOne)));
            }
        });
        sil.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                int i=1, result=1;
                int n=Math.round(Integer.parseInt(textDown.getText().toString()));
                if(n<0){
                    n=n*(-1);
                }
                while(i<=n){
                    result*=i;
                    i++;
                }
                textUp.setText(n +"!");
                textDown.setText(String.valueOf(result));
            }
        });

    }
}


