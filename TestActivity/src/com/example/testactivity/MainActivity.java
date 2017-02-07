package com.example.testactivity;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {
	final String TAG="tag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "MainActivity-->onCreate");
    }
    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();Log.i(TAG, "MainActivity-->onStart");
    }
    @Override
    protected void onResume(){
    	super.onResume();Log.i(TAG, "MainActivity-->onResume");
    }
    @Override
    protected void onPause(){
    	super.onPause();Log.i(TAG, "MainActivity-->onPause");
    }
    @Override
    protected void onStop(){
    	super.onStop();Log.i(TAG, "MainActivity-->onStop");
    }
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();Log.i(TAG,"MainActivity-->onDestroy");
    }

}
