package com.example.testactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends Activity{
	private Button bt1,bt2;
	private Context mContext;
	private TextView tv1;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fmain);
		mContext=this;
		bt1=(Button)findViewById(R.id.button1);
		bt2=(Button)findViewById(R.id.button2);
		tv1=(TextView)findViewById(R.id.textView1);
		bt1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(mContext,SecondActivity.class);
				startActivity(intent);
			}
			
		});
		bt2.setOnClickListener(new OnClickListener(){

			public void onClick(View arg0){
				Intent intent=new Intent(mContext,SecondActivity.class);
				startActivityForResult(intent, 1);
			}

			
		});
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode==1&&resultCode==2){
			String content=data.getStringExtra("data");
			tv1.setText(content);
		}
	}

	
}
