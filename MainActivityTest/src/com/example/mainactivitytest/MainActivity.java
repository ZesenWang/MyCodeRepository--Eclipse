
package com.example.mainactivitytest;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	// TODO Auto-generated method stub
    	super.onActivityResult(requestCode, resultCode, data);
    	if(resultCode==0){
    		Bundle bundle = data.getExtras();
    		String s = bundle.getString("name")+bundle.getDouble("age");
    		Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    	}
    	if(resultCode==1){
    		String s = data.getStringExtra("name");
    		Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    	}
    }
    
    public void doClick(View v){
    	Intent intent;
    	switch(v.getId()){
    	case R.id.button1:
    		intent = new Intent(MainActivity.this,Main2.class);
    		startActivityForResult(intent,0);
    		break;
    	case R.id.button2:
    		intent = new Intent(MainActivity.this,Main3.class);
    		startActivityForResult(intent,0);
    		break;
    	}
    }
}
