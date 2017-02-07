package com.example.broadcastreceiver;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intentfilter = new IntentFilter("BC_One");
        BC2 bc2 = new BC2();
        registerReceiver(bc2,intentfilter);
    }
    public void doClick(View v){
    	switch(v.getId()){
    	case R.id.button1:
    		Intent intent=new Intent();
    		intent.putExtra("msg","这是一条普通广播");
    		intent.setAction("BC_One");
    		sendBroadcast(intent);
    		break;
    	}
    }

   
}
