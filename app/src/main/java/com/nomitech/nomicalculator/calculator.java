package com.nomitech.nomicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class calculator extends AppCompatActivity implements View.OnClickListener {
 Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,btnPerc,
    btnAdd, btnSub,btnMul,btnDiv,btnEqual , btnDot, btnClear,btn000,btnSR;
    EditText edt;
    Float res1, res2;
    boolean Add,Sub,Mul,Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        edt=findViewById(R.id.EdtResult);
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
         btn000=findViewById(R.id.btn000);


      btn1.setOnClickListener(this);
      btn2.setOnClickListener(this);
      btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn000.setOnClickListener(this);
        btnDot.setOnClickListener(this);

        btnAdd.setOnClickListener(this);
        btnMul.setOnClickListener(this);
         btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
 btnEqual.setOnClickListener(this);
btnClear.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {


        switch(v.getId())
        { case R.id.btn1:
            edt.setText(edt.getText()+"1");

            return;
            case R.id.btn2:
                edt.setText(edt.getText()+"2");

                return;

            case R.id.btn3:
                edt.setText(edt.getText()+"3");

                return;
            case R.id.btn4:
                edt.setText(edt.getText()+"4");

                return;

            case R.id.btn5:
                edt.setText(edt.getText()+"5");

                return;
            case R.id.btn6:
                edt.setText(edt.getText()+"6");

                return;
            case R.id.btn7:
                edt.setText(edt.getText()+"7");

                return;

            case R.id.btn8:
                edt.setText(edt.getText()+"8");

                return;
            case R.id.btn9:
                edt.setText(edt.getText()+"9");

                return;

            case R.id.btn0:
                edt.setText(edt.getText()+"0");

                return;
            case R.id.btn000:
                edt.setText(edt.getText()+"000");

                return;
            case R.id.btnDot:
                edt.setText(edt.getText()+".");

                return;

            case R.id.btnAdd:
                if (edt==null)
                {
                    edt.setText(" ");
                    Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();
                }
                else {
                    res1=Float.parseFloat(edt.getText()+ " ");
                    Add=true;
                    edt.setText(" ");
                }
                return;

            case R.id.btnMul:
                if (edt==null)
                {
                    edt.setText(" ");
                    Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();

                }
                else {
                    res1=Float.parseFloat(edt.getText()+ " ");
                    Mul=true;
                    edt.setText(" ");
                }
                return;

            case R.id.btnDiv:
                if (edt==null)
                {
                    edt.setText(" ");
                    Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();

                }
                else {
                    res1=Float.parseFloat(edt.getText()+ " ");
                    Div=true;
                    edt.setText(" ");
                }
                return;

            case R.id.btnSub:
                if (edt==null)
                {
                    edt.setText(" ");
                    Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();

                }
                else {
                    res1=Float.parseFloat(edt.getText()+ " ");
                    Sub=true;
                    edt.setText(" ");

                }
                return;



            case R.id.btnEqual:
                res2=Float.parseFloat(edt.getText()+" ");
                if (Add==true)
                {
                    edt.setText(res1+res2+" ");
                    Add=false;
                }
                if (Sub==true)
                {
                    edt.setText(res1-res2+" ");
                    Sub=false;
                }
                if (Div==true)
                {
                    edt.setText(res1/res2+" ");
                    Div=false;
                }
                if (Mul==true)
                {
                    edt.setText(res1*res2+" ");
                    Mul=false;
                }
                 return;

            case R.id.btnClear:
                edt.setText(" ");
                return;

        }


        }
}