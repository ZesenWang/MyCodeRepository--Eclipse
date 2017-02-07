package com.example.searchview;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import android.os.Build;

public class MainActivity extends Activity {
	
	SearchView search;
	ListView lv;
	String [] str = {"hola","bonjour","ÄãºÃ","hello"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        search = (SearchView) findViewById(R.id.searchView1);
        lv = (ListView)findViewById(R.id.listView1);
        
        search.setIconifiedByDefault(true);
        search.setSubmitButtonEnabled(true);
        search.setQueryHint("Hola");
        search.setOnQueryTextListener(new OnQueryTextListener() {
			
			@Override
			public boolean onQueryTextSubmit(String arg0) {
				// TODO Auto-generated method stub				
				return true;
			}
			
			@Override
			public boolean onQueryTextChange(String arg0) {
				// TODO Auto-generated method stub
				if(TextUtils.isEmpty(arg0))
					lv.clearTextFilter();
				else
					lv.setFilterText(arg0);
				return true;
			}
		});
        
        lv.setAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1,str));
        lv.setTextFilterEnabled(true);
    }


}
