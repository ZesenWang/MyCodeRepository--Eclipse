package com.example.memo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity {
	
	Button button;
	ListView listView;
	ArrayAdapter adapter;
	ActionBar actionBar;
	List list;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                
        
        list = new ArrayList();
        
        actionBar = getActionBar();
        actionBar.setDisplayShowHomeEnabled(false);
        
        button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,EditActivity.class);
				startActivityForResult(intent,0);
			}
		});
        
        adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,list);
        
        listView = (ListView)findViewById(R.id.listView1);
        listView.setAdapter(adapter);
        
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	// TODO Auto-generated method stub
    	MenuInflater inflator = new MenuInflater(this);
    	inflator.inflate(R.menu.main, menu);
    	return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    	return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
    	// TODO Auto-generated method stub
    	super.onActivityResult(requestCode, resultCode, intent);
    	
    	if(resultCode==0){
    		String title = intent.getExtras().getString("title");
    		list.add(title);
    		adapter.notifyDataSetChanged();
    	}
    	if(resultCode==1){
    		Toast.makeText(MainActivity.this, "No memo content saved", Toast.LENGTH_LONG).show();
    	}
    }
}
