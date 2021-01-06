
package com.nomitech.nomicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
        btnAdd, btnSub,btnMul,btnDiv,btnEqual , btnDot, btnClear;
EditText edt;
Float res1, res2;
boolean Add,Sub,Mul,Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt=findViewById(R.id.edt);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);
        btnDot=findViewById(R.id.btnDot);
        btnEqual=findViewById(R.id.btnEqual);
        btnClear=findViewById(R.id.btnClear);

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

edt.setText(edt.getText()+ "1");
        }
    });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt.setText(edt.getText()+ "2");
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt.setText(edt.getText()+ "3");
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt.setText(edt.getText()+ "4");
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt.setText(edt.getText()+ "5");
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt.setText(edt.getText()+ "6");
            }
        });



        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt.setText(edt.getText()+ "7");
            }
        });



        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt.setText(edt.getText()+ "8");
            }
        });



        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt.setText(edt.getText()+ "9");
            }
        });



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt.setText(edt.getText()+ "0");
            }
        });


        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt.setText(edt.getText()+ ".");
            }
        });


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt==null)
                {
                    edt.setText(" ");
                }
                else {
                    res1=Float.parseFloat(edt.getText()+"");
                    Add=true;
                    edt.setText(null);
                }
            }
        });


        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt==null)
                {
                    edt.setText(" ");
                }
                else {
                    res1=Float.parseFloat(edt.getText()+"");
                    Mul=true;
                    edt.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt==null)
                {
                    edt.setText(" ");
                }
                else {
                    res1=Float.parseFloat(edt.getText()+"");
                    Sub=true;
                    edt.setText(null);
                }
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt==null)
                {
                    edt.setText(" ");
                }
                else {
                    res1=Float.parseFloat(edt.getText()+"");
                    Div=true;
                    edt.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2=Float.parseFloat(edt.getText()+"");
                if (Add==true)
                {
                    edt.setText(res1+res2+"");
                    Add=false;
                }
                if (Sub==true)
                {
                    edt.setText(res1-res2+"");
                    Add=false;
                }

                if (Mul==true)
                {
                    edt.setText(res1*res2+"");
                    Add=false;
                }
                if (Div==true)
                {
                    edt.setText(res1/res2+"");
                    Add=false;
                }


            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(" ");
            }
        });
    }
}
