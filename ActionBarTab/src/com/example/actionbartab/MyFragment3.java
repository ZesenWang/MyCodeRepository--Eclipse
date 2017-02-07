package com.example.actionbartab;

import android.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment3 extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		TextView text = new TextView(getActivity());
		text.setGravity(Gravity.START);
		text.setText("3");
		text.setTextSize(30);
		return text;
	}
}
