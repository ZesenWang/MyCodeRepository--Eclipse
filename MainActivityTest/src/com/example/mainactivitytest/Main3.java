package com.example.mainactivitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3 extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fff);
	}
	public void doClick(View v){
		Bundle bundle = new Bundle();
		bundle.putString("name", "wang");
		bundle.putDouble("age",22);
		Intent intent = getIntent();
		intent.putExtras(bundle);
		setResult(1,intent);
		finish();
	}
}
