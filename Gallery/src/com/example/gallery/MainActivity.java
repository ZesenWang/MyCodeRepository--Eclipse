package com.example.gallery;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	
	int[] res={R.drawable.item1,R.drawable.item2,R.drawable.item3,
			R.drawable.item4,R.drawable.item5,R.drawable.item6,
			R.drawable.item7,R.drawable.item8,R.drawable.item9,
			R.drawable.item10,R.drawable.item11,R.drawable.item12};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
