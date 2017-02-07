package com.example.memo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends Activity{
	
	EditText edit1;
	EditText edit2;
	Button button1;
	Button button2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.edit);
		
		edit1 = (EditText)findViewById(R.id.editText1);
		edit2 = (EditText)findViewById(R.id.editText2);
		button1 = (Button)findViewById(R.id.save);
		button2 = (Button)findViewById(R.id.cancel);
		
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = getIntent();
				Bundle bundle = new Bundle();
				
				bundle.putString("title",edit1.getText().toString());
				bundle.putString("memo", edit2.getText().toString());
				
				intent.putExtras(bundle);
				EditActivity.this.setResult(0,intent);
				EditActivity.this.finish();
			}
		});
		
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				EditActivity.this.setResult(1);
				EditActivity.this.finish();
			}
		});
	}
	
}
