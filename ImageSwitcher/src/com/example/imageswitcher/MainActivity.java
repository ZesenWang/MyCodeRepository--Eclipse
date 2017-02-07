package com.example.imageswitcher;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher.ViewFactory;
import android.os.Build;

public class MainActivity extends Activity implements ViewFactory{
	
	ImageSwitcher switcher;	
	int[] resID = {R.drawable.snowynight1,R.drawable.snowynight2,R.drawable.snowynight3,
			R.drawable.snowynight4,R.drawable.snowynight5,};
	ImageView[] v;
	

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        v[0] = (ImageView)findViewById(R.id.imageView1);
//        v[1] = (ImageView)findViewById(R.id.imageView2);
//        v[2] = (ImageView)findViewById(R.id.imageView3);
//        v[3] = (ImageView)findViewById(R.id.imageView4);
//        v[4] = (ImageView)findViewById(R.id.imageView5);
        switcher = (ImageSwitcher)findViewById(R.id.imageSwitch1);
        
        switcher.setFactory(this);
        switcher.setInAnimation(AnimationUtils.loadAnimation(getApplicationContext(),  
                android.R.anim.slide_in_left));
        switcher.setOutAnimation(AnimationUtils.loadAnimation(  
                getApplicationContext(), android.R.anim.slide_out_right)); 
        
        switcher.setImageResource(R.drawable.snowynight1);
        //v[0].setAlpha(1);
  
    }
	@Override
	public View makeView() {
		// TODO Auto-generated method stub
		final ImageView v = new ImageView(this);
		v.setScaleType(ImageView.ScaleType.CENTER_CROP);
//		v.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
		return v;
	}


}
