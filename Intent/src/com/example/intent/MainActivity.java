package com.example.intent;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends Activity implements OnClickListener{
	
	Button bt1,bt2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        bt1=(Button)findViewById(R.id.button1);
        bt2=(Button)findViewById(R.id.button2);
        
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }
    
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.button1:
			Intent intent=new Intent();
			intent.setAction("android.intent.action.MyAction");
			startActivity(intent);
			break;
		case R.id.button2:
			Intent intent1=new Intent();
			intent1.setAction(Intent.ACTION_VIEW);
			Uri data=Uri.parse("http://baidu.com");
			intent1.setData(data);
			startActivity(intent1);
			break;
		}
	}


}
