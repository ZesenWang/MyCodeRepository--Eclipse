package com.example.viewflipper;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.ViewFlipper;
import android.os.Build;

public class MainActivity extends ActionBarActivity implements OnTouchListener{
	
	ViewFlipper viewflipper;
	int []resId={R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4};
    float startx;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        viewflipper=(ViewFlipper)findViewById(R.id.viewFlipper1);
        for(int i=0;i<resId.length;i++){
        	viewflipper.addView(getImageView(resId[i]));
        }
        //viewflipper.setFlipInterval(3000);
        //viewflipper.startFlipping();
        viewflipper.setOnTouchListener(this);
    }
	private ImageView getImageView(int id){
		
		ImageView image=new ImageView(this);
		//image.setImageResource(id);
		image.setBackgroundResource(id);
		return image;
		
	}

	@Override
	public boolean onTouch(View arg0, MotionEvent event) {
		// TODO Auto-generated method stub
		switch(event.getAction()){
		case MotionEvent.ACTION_DOWN:
			startx=event.getX();
			break;
		case MotionEvent.ACTION_MOVE:
			if(startx-event.getX()>100){
				viewflipper.showPrevious();
			}
			if(event.getX()-startx>100){
				viewflipper.showNext();
			}
			break;
		}
		return super.onTouchEvent(event);
	}
}
