package com.example.spinner;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity implements OnItemSelectedListener{

	TextView tv;
	Spinner sp;
	ArrayAdapter adapter;
	List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView1);
        sp=(Spinner)findViewById(R.id.spinner1);
        tv.setText("You choose Beijing");
        list=new ArrayList<String>();
        list.add("Beijing");
        list.add("Shanghai");
        list.add("Guangzhou");
        list.add("Shenzhen");
        adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(this);
    }
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		String name=(String) adapter.getItem(arg2);
		tv.setText("You choose "+name);
	}
	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}


}
