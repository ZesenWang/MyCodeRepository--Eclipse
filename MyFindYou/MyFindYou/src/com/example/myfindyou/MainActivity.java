package com.example.myfindyou;

import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.location.LocationClientOption.LocationMode;
import com.example.myfindyou.MyLocationListener.MyStopListener;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	public EditText et;
	private ToPhoneReceiver tpr;
	private IntentFilter filter;
	private RevMessageReceiver rmr;
	private IntentFilter filter2;
	public TextView baidu_tv;
	public Button baidu_bt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		et = (EditText)findViewById(R.id.editText1);
		baidu_tv = (TextView)findViewById(R.id.textView1);
		
		tpr = new ToPhoneReceiver();
		filter = new IntentFilter();
		rmr = new RevMessageReceiver();
		filter2 = new IntentFilter();
		
		filter.addAction("android.intent.action.NEW_OUTGOING_CALL");
		registerReceiver(tpr, filter);
		
		filter2.addAction("android.provider.Telephony.SMS_RECEIVED");
		registerReceiver(rmr,filter2);
		
		 
	}
	

	
	public void onClick(View v){
		switch(v.getId()){
		case R.id.button1:
			break;
		case R.id.button2:
			break;
		}
	}
	
}
