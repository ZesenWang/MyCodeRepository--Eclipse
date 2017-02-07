package com.example.tab;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment2 extends Fragment{
	TextView tv;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View view=inflater.inflate(R.layout.fragment2,container,false);
		tv=(TextView)view.findViewById(R.id.textView1);
		tv.setText("∂ØÃ¨º”‘ÿfragment");
		return view;
	}
}
