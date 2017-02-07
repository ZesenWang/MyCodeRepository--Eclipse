package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class MainActivity extends ActionBarActivity implements OnClickListener{
	private Button bt1;
	private Button bt2;
	private Button bt3;
	private Button bt4;
	private Button bt5;
	private Button bt6;
	private Button bt7;
	private Button bt8;
	private Button bt9;
	private Button bt0;
	private Button btplus;
	private Button btminus;
	private Button btmulti;
	private Button btdivide;
	private Button btc;
	private Button btdel;
	private Button btdot;
	private Button btequal;
	private EditText et_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        et_input=(EditText)findViewById(R.id.et_input);        
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt4=(Button)findViewById(R.id.bt4);
        bt5=(Button)findViewById(R.id.bt5);
        bt6=(Button)findViewById(R.id.bt6);
        bt7=(Button)findViewById(R.id.bt7);
        bt8=(Button)findViewById(R.id.bt8);
        bt9=(Button)findViewById(R.id.bt9);
        bt0=(Button)findViewById(R.id.bt0);
        btc=(Button)findViewById(R.id.btc);
        btdel=(Button)findViewById(R.id.btdel);
        btplus=(Button)findViewById(R.id.btplus);
        btminus=(Button)findViewById(R.id.btminus);
        btmulti=(Button)findViewById(R.id.btmulti);
        btdivide=(Button)findViewById(R.id.btdivide);
        btequal=(Button)findViewById(R.id.btequal);
        btdot=(Button)findViewById(R.id.btdot);
        
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt0.setOnClickListener(this);
        btdel.setOnClickListener(this);
        btc.setOnClickListener(this);
        btplus.setOnClickListener(this);
        btminus.setOnClickListener(this);
        btmulti.setOnClickListener(this);
        btdivide.setOnClickListener(this);
        btequal.setOnClickListener(this);
        btdot.setOnClickListener(this);
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String str=new String(et_input.getText().toString());
		
		switch(arg0.getId()){
		case R.id.bt0:
		case R.id.bt1:
		case R.id.bt2:
		case R.id.bt3:
		case R.id.bt4:
		case R.id.bt5:
		case R.id.bt6:
		case R.id.bt7:
		case R.id.bt8:
		case R.id.bt9:
			et_input.setText(str+((Button)arg0).getText());
			break;
		case R.id.btdot:
			et_input.setText(str+'.');
			break;
		case R.id.btplus:
			et_input.setText(str+" + ");
			break;
		case R.id.btminus:
			et_input.setText(str+" - ");
			break;
		case R.id.btmulti:
			et_input.setText(str+" * ");
			break;
		case R.id.btdivide:
			et_input.setText(str+" / ");
			break;
		case R.id.btequal:
			getResult();
			break;
		case R.id.btdel:
			et_input.setText(str.substring(0,str.length()-1));
			break;
		case R.id.btc:
			et_input.setText("");
			break;
		}
	}
	public void getResult(){
		String str=et_input.getText().toString();
		int space=str.indexOf(' ');
		String oprand1=str.substring(0,space);
		String oprand2=str.substring(space+3);
		String operator=str.substring(space+1,space+2);
		double op1=Double.parseDouble(oprand1);
		double op2=Double.parseDouble(oprand2);
		double result=0;
		String minus="-";
		String multi="*";
		if(operator.equals("+"))
			result=op1+op2;
		else if(operator.equals(minus))
			result=op1-op2;
		else if(operator.equals(multi))
			result=op1*op2;
		else 
			result=op1/op2;
		et_input.setText(result+"");
	};
}
