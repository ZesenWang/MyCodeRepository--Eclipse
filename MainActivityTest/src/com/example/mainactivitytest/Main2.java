package com.example.mainactivitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2 extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ooooo);
	}
	public void doClick(View v){
		Bundle bundle = new Bundle();
		bundle.putString("name", "jason");
		bundle.putDouble("age",20.6);
		Intent intent = getIntent();
		intent.putExtras(bundle);
		setResult(0,intent);
		finish();
	}
}
