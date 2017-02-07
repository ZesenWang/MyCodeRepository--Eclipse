package com.example.scrollview;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity implements OnClickListener{
	
	TextView tv;
	ScrollView scroll;
	Button bt1,bt2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        scroll=(ScrollView)findViewById(R.id.scrollView1);
        tv=(TextView)findViewById(R.id.textView1);
        bt1=(Button)findViewById(R.id.button1);
        bt2=(Button)findViewById(R.id.button2);
        
        tv.setText(getString(R.string.content));
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        
        scroll.setOnTouchListener(new OnTouchListener(){        
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				switch(arg1.getAction()){
				
				case MotionEvent.ACTION_MOVE:
					if(scroll.getScrollY()<=0)
						Log.i("main", "top");
					
					if(scroll.getChildAt(0).getMeasuredHeight()==scroll.getHeight()
							+scroll.getScrollY()){
						Log.i("cool","bottom");
						tv.append(getString(R.string.content));
					}
					break;
						
				}
				return false;
			}
        	
        });
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.button1:
			scroll.scrollBy(0,-30);
			break;
		case R.id.button2:
			scroll.scrollBy(0,30);
			break;
		}
	}


}
