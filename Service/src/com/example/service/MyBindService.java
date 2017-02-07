package com.example.service;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyBindService extends Service{
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.i("info","BindService--onCreate");
		super.onCreate();
	}
	
	public class MyBinder extends Binder{
		public MyBindService getService(){
			return MyBindService.this;
		}
	}
	
	
	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		Log.i("info","BindService--onBind");
		return new MyBinder();
	}
	@Override
	public void unbindService(ServiceConnection conn) {
		// TODO Auto-generated method stub
		Log.i("info","BindService--unbindService");
		super.unbindService(conn);
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("info","BindService--onDestroy");
		super.onDestroy();
	}
	public void Play(){
		Log.i("info","Play");
	}
	public void Previous(){
		Log.i("info","Previous");
	}
	public void Pause(){
		Log.i("info","Pause");
	}
	public void Next(){
		Log.i("info","Next");
	}
}

