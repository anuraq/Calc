package com.garuna.calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView res_tv=findViewById(R.id.result_tv);
    TextView a_tv=findViewById(R.id.result_tv);
    boolean run =false,cal=false;
    int r=0,i=0,j=0,res,l=0;
    int a[];
    char op[];
    String s=new String();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res_tv.setText("0");
        Button c_btn=findViewById(R.id.c_btn);
        Button back_btn=findViewById(R.id.back_btn);
        Button div_btn=findViewById(R.id.div_btn);
        Button mul_btn=findViewById(R.id.mul_btn);
        Button btn_7=findViewById(R.id.btn_7);
        Button btn_8=findViewById(R.id.btn_8);
        Button btn_9=findViewById(R.id.btn_9);
        Button btn_4=findViewById(R.id.btn_4);
        Button btn_5=findViewById(R.id.btn_5);
        Button btn_6=findViewById(R.id.btn_6);
        Button btn_1=findViewById(R.id.btn_1);
        Button btn_2=findViewById(R.id.btn_2);
        Button btn_3=findViewById(R.id.btn_3);
        Button sub_btn=findViewById(R.id.sub_btn);
        Button add_btn=findViewById(R.id.add_btn);
        Button eq_btn=findViewById(R.id.eq_btn);
        Button per_btn=findViewById(R.id.p_btn);
        Button btn_0=findViewById(R.id.btn_0);
        Button dec_btn=findViewById(R.id.dec_btn);
        c_btn.setOnClickListener(this);
        back_btn.setOnClickListener(this);
        div_btn.setOnClickListener(this);
        mul_btn.setOnClickListener(this);
        sub_btn.setOnClickListener(this);
        add_btn.setOnClickListener(this);
        eq_btn.setOnClickListener(this);
        per_btn.setOnClickListener(this);
        dec_btn.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
    }

    public void addDigit(View view){
        Button button=findViewById(view.getId());
        int d=Integer.parseInt((String) button.getText());
        if(!run) {
            r=d;
            a[i]=r;
            res_tv.setText(s+r);
            run=true;
        }
        else {
            if(!cal){
                r=r*10+d;
                a[i]=r;
                res_tv.setText(s+r);
            }
            else{
                r=r*10+d;
                a[i]=r;
                for(l=0;l<op.length;l++){
                    if(op[l]=='x'){
                        res+=a[l]*a[l+1];
                    }
                    else if(op[l]=='+'){
                        res+=a[l]+a[l+1];
                    }
                    else if(op[l]=='/'){
                        res+=a[l]/a[l+1];
                    }
                    else if(op[l]=='-'){
                        res+=a[l]-a[l+1];
                    }
                }
                a_tv.setText(res);
                res_tv.setText(s);
            }
        }
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_0: {
                addDigit(view);
                break;
            }
            case R.id.btn_1: {
                addDigit(view);
                break;
            }
            case R.id.btn_2: {
                addDigit(view);
                break;
            }
            case R.id.btn_3: {
                addDigit(view);
                break;
            }
            case R.id.btn_4: {
                addDigit(view);
                break;
            }
            case R.id.btn_5: {
                addDigit(view);
                break;
            }
            case R.id.btn_6: {
                addDigit(view);
                break;
            }
            case R.id.btn_7: {
                addDigit(view);
                break;
            }
            case R.id.btn_8: {
                addDigit(view);
                break;
            }
            case R.id.btn_9: {
                addDigit(view);
                break;
            }
            case R.id.add_btn: {
                if(!run){
                    s=0+"/n"+"+"+" ";
                    res_tv.setText(s);
                    run=true;
                    cal=true;
                }
                else{
                    s=s+r+"/n";
                    a[i]=r;
                    i++;
                    op[j]='+';
                    j++;
                    s=s+"+ ";
                }
                break;
            }
            case R.id.sub_btn: {
                if(!run){
                    s=0+"/n"+"-"+" ";
                    res_tv.setText(s);
                    run=true;
                    cal=true;
                }
                else{
                    s=s+r+"/n";
                    a[i]=r;
                    i++;
                    op[j]='-';
                    j++;
                    s=s+"- ";
                }
                break;
            }
            case R.id.mul_btn: {
                if(!run){
                    s=0+"/n"+"x"+" ";
                    res_tv.setText(s);
                    run=true;
                    cal=true;
                }
                else{
                    s=s+r+"/n";
                    a[i]=r;
                    i++;
                    op[j]='x';
                    j++;
                    s=s+"x ";
                }
                break;
            }
            case R.id.div_btn: {
                if(!run){
                    s=0+"/n"+"/"+" ";
                    res_tv.setText(s);
                    run=true;
                    cal=true;
                }
                else{
                    s=s+r+"/n";
                    a[i]=r;
                    i++;
                    op[j]='/';
                    j++;
                    s=s+"/ ";
                }
                break;
            }
        }

    }
}
