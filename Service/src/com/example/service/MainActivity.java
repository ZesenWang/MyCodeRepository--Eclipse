package com.example.service;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {
	
	Intent intent1=new Intent(MainActivity.this,MyStartService.class);
	Intent intent2;
	MyBindService service;
	ServiceConnection conn=new ServiceConnection(){

		@Override
		public void onServiceConnected(ComponentName name, IBinder binder) {
			// TODO Auto-generated method stub
			service=((com.example.service.MyBindService.MyBinder)binder).getService();
		}

		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub
			
		}
		
	};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      
    }
    public void doClick(View v){
    	   	
    	switch(v.getId()){
    	
    	case R.id.button1:
    		intent1=new Intent(MainActivity.this,MyStartService.class);
    		startService(intent1);
    		break;
    		
    	case R.id.button2:
    		stopService(intent1);
    		break;
    		
    	case R.id.button3:
    		intent2=new Intent(MainActivity.this,MyBindService.class);
    		startService(intent2);
    		bindService(intent2,conn,Service.BIND_AUTO_CREATE);
    		break;
    		
    	case R.id.button4:
    		service.Play();
    		break;
    		
    	case R.id.button5:
    		service.Pause();
    		break;
    		
    	case R.id.button6:
    		service.Previous();
    		break;
    		
    	case R.id.button7:
    		service.Next();
    		break;
    	case R.id.button8:
    		unbindService(conn);
    		break;
    		
    	}
    }

}
