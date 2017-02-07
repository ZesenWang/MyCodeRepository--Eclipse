package com.example.togglebutton;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ToggleButton;
import android.os.Build;

public class MainActivity extends ActionBarActivity implements OnCheckedChangeListener{
	private ToggleButton tb;
	private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb=(ToggleButton)findViewById(R.id.toggleButton1);
        img=(ImageView)findViewById(R.id.imageView1);
        tb.setOnCheckedChangeListener(this);
    }
	@Override
	public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
		// TODO Auto-generated method stub
		img.setBackgroundResource(arg1?R.drawable.haha:R.drawable.ic_launcher);
	}


  

}
