package com.example.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

public class TitleFragment extends Fragment{
	
	private ImageButton mLeftMenu;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState){
		OnClickListener onclicklistener;
		onclicklistener=new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getActivity(), "I am an ImageButton in TitleFragment!",
						Toast.LENGTH_SHORT).show();
			}
		};
		View view=inflater.inflate(R.layout.titlefragment,container,false);
		mLeftMenu=(ImageButton)view.findViewById(R.id.imageButton1);
		mLeftMenu.setOnClickListener(onclicklistener);
		return view;
	}
}
