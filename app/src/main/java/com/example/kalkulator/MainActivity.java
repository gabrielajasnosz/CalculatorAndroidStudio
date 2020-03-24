package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double ValueOne , ValueTwo ;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision, mComa,mPer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b0=findViewById(R.id.button0);
        final Button b1=findViewById(R.id.button1);
        final Button b2=findViewById(R.id.button2);
        final Button b3=findViewById(R.id.button3);
        final Button b4=findViewById(R.id.button4);
        final Button b5=findViewById(R.id.button5);
        final Button b6=findViewById(R.id.button6);
        final Button b7=findViewById(R.id.button7);
        final Button b8=findViewById(R.id.button8);
        final Button b9=findViewById(R.id.button9);
        final Button dot=findViewById(R.id.dot);
        final Button equals=findViewById(R.id.buttonEquals);
        final Button to3=findViewById(R.id.button33);
        final Button sqrt=findViewById(R.id.buttonSqrt);
        final Button to2=findViewById(R.id.buttonSQUARE);
        final Button div=findViewById(R.id.buttonDivide);
        final Button ac=findViewById(R.id.buttonAC);
        final Button sil=findViewById(R.id.buttonSIL);
        final Button per=findViewById(R.id.buttonPercent);
        final Button plus=findViewById(R.id.buttonPlus);
        final Button min=findViewById(R.id.buttonMinus);
        final Button sign=findViewById(R.id.buttonPlusMinus);
        final Button log=findViewById(R.id.buttonLog);
        final Button mul=findViewById(R.id.buttonMultiply);
        final TextView text=findViewById(R.id.numberTextView);
        text.setText("0");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("0")){
                text.setText("1");}
                else{
                    text.append("1");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("0")){
                    text.setText("2");}
                else{
                    text.append("2");
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("0")){
                    text.setText("3");}
                else{
                    text.append("3");
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("0")){
                    text.setText("4");}
                else{
                    text.append("4");
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("0")){
                    text.setText("5");}
                else{
                    text.append("5");
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("0")){
                    text.setText("6");}
                else{
                    text.append("6");
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("0")){
                    text.setText("7");}
                else{
                    text.append("7");
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("0")){
                    text.setText("8");}
                else{
                    text.append("8");
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("0")){
                    text.setText("9");}
                else{
                    text.append("9");
                }
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!text.getText().toString().equals("0")){
                    text.append("0");}
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    ValueOne = Double.parseDouble(text.getText().toString());
                    mAddition = true;
                    text.setText("0");
                    mComa=false;

            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(text.getText().toString());
                mSubtract = true ;
                text.setText("0");
                mComa=false;
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(text.getText().toString());
                mMultiplication = true ;
                text.setText("0");
                mComa=false;
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(text.getText().toString());
                mDivision = true ;
                text.setText("0");
                mComa=false;
            }
        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!text.getText().toString().equals("0")) {
                    ValueOne = Double.parseDouble(text.getText().toString()) * (-1);
                    text.setText(String.valueOf(ValueOne));
                }
            }
        });

        to2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    ValueOne = Double.parseDouble(text.getText().toString());
                    text.setText(String.valueOf(ValueOne*ValueOne));

            }
        });
        to3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(text.getText().toString());
                text.setText(String.valueOf(Math.pow(ValueOne,3)));

            }
        });

        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(text.getText().toString());
                mPer = true ;
                text.setText("0");
                mComa=false;
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(text.getText().toString());
                text.setText(String.valueOf(Math.sqrt(ValueOne)));
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Double.parseDouble(text.getText().toString());
                text.setText(String.valueOf(Math.log10(ValueOne)));
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueTwo = Double.parseDouble(text.getText().toString());

                if (mAddition){
                    text.setText(String.valueOf(ValueOne+ValueTwo));
                    mAddition=false;
                    mComa = true;
                }


                if (mSubtract){
                    text.setText(String.valueOf(ValueOne-ValueTwo));
                    mSubtract=false;
                    mComa = true;
                }

                if (mMultiplication){
                    text.setText(String.valueOf(ValueOne*ValueTwo));
                    mMultiplication=false;
                    mComa = true;
                }

                if (mDivision){
                    text.setText(String.valueOf(ValueOne/ValueTwo));
                    mDivision=false;
                    mComa = true;
                }
                if(mPer){
                    text.setText(String.valueOf(ValueOne%ValueTwo));
                    mPer=false;
                    mComa = true;
                }
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("0");
                mComa=false;
                mAddition=false;
                mDivision=false;
                mMultiplication=false;
                mSubtract=false;
                mPer=false;
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mComa) {
                    text.append(".");
                    mComa = true;
                }

            }
        });
    }
    }
