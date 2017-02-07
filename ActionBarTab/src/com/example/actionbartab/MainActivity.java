package com.example.actionbartab;

import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity implements ActionBar.TabListener{
	
	ActionBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bar = getActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        
        bar.addTab(bar.newTab().setText("第一页").setTabListener(this));
        bar.addTab(bar.newTab().setText("第二页").setTabListener(this));
        bar.addTab(bar.newTab().setText("第三页").setTabListener(this));
        
    }
	@Override
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		FragmentTransaction transaction = getFragmentManager().beginTransaction();
		switch(arg0.getPosition()){
		case 0:
			MyFragment1 f1 = new MyFragment1();
			
			transaction.replace(R.id.container, f1);
			transaction.commit();
			break;
		case 1:
			MyFragment2 f2 = new MyFragment2();
		
			transaction.replace(R.id.container, f2);
			transaction.commit();
			break;
		case 2:
			MyFragment3 f3 = new MyFragment3();
		
			transaction.replace(R.id.container, f3);
			transaction.commit();
			break;
		}
	}
	@Override
	public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}


   

}
