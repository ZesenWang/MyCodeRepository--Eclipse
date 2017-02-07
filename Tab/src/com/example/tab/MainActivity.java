package com.example.tab;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.os.Build;

public class MainActivity extends ActionBarActivity implements OnCheckedChangeListener{
	
	private RadioGroup group; 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        group=(RadioGroup)findViewById(R.id.radioGroup1);
        group.setOnCheckedChangeListener(this);
    
    }
	@Override
	public void onCheckedChanged(RadioGroup arg0, int checkedId) {
		// TODO Auto-generated method stub
		FragmentManager fragmentManager=getFragmentManager();
		FragmentTransaction beginTransaction=fragmentManager.beginTransaction();
		switch(checkedId){
		case R.id.radio0:
			MyFragment3 fragment3=new MyFragment3();
			beginTransaction.add(R.id.frame,fragment3);
			beginTransaction.commit();
			break;
		case R.id.radio1:
			MyFragment2 fragment2=new MyFragment2();		
			beginTransaction.add(R.id.frame, fragment2);
			beginTransaction.addToBackStack(null);
			beginTransaction.commit();
			break;
			
		case R.id.radio2:
			break;
			
		case R.id.radio3:
			break;
		}
	}


  
}
