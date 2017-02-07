package com.example.gallery;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ImageAdapter extends BaseAdapter{
	int []res;
	public ImageAdapter(int[] res){
		this.res=res;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return res.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return res[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		return null;
	}

}
