package com.example.fenqile;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.os.Build;

public class MainActivity extends Activity {
	
	RadioGroup radio;
	FragmentManager fragmentManager;
	MyFragment1 f1 = new MyFragment1();
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_main);
                
        radio = (RadioGroup) findViewById(R.id.radioGroup1);		
		
        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int checkedID) {
				// TODO Auto-generated method stub
				
				fragmentManager  = getFragmentManager();
				FragmentTransaction transaction = fragmentManager.beginTransaction();
				
				switch(checkedID){
				case R.id.radio0:
					MyFragment1 f1 = new MyFragment1();
					transaction.replace(R.id.frameLayout, f1);
					transaction.commit();
					break;
				case R.id.radio1:
					MyFragment2 f2 = new MyFragment2();
					transaction.replace(R.id.frameLayout, f2);
					transaction.commit();
					break;
				case R.id.radio2:
					MyFragment3 f3 = new MyFragment3();
					transaction.replace(R.id.frameLayout, f3);
					transaction.commit();
					break;
				}
				
			}
		});
    }
}
