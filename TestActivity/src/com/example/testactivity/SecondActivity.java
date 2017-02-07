package com.example.testactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity{
	private Button bt1;
	private String content="Hello";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.smain);
		bt1=(Button)findViewById(R.id.button1);
		bt1.setOnClickListener(new OnClickListener(){

			public void onClick(View arg0){
				Intent data=new Intent();
				data.putExtra("data", content);
				setResult(2,data);
				finish();
			}
			
		});
	}
}
