package com.example.gridview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity implements OnItemClickListener{
	
	GridView gridview;
	List<Map<String,Object>> datalist;	
	SimpleAdapter adapter;
	int icon[]={R.drawable.address_book,R.drawable.calendar,R.drawable.camera,R.drawable.clock,
			R.drawable.games_control,R.drawable.messenger,R.drawable.ringtone,R.drawable.settings,R.drawable.speech_balloon,
			R.drawable.weather,R.drawable.world,R.drawable.youtube};
	String iconname[]={"address_book","calendar","camera","clock","games_control","messenger","ringtone",
			"settings","speech_balloon","weather","world","youtube"};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview=(GridView)findViewById(R.id.gridView1);
        datalist=new ArrayList<Map<String,Object>>();
        adapter=new SimpleAdapter(this,getData(),R.layout.item, new String[]{"image","text"},
        		new int[]{R.id.imageview1,R.id.textview1});
        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(this);
    }
    
	private List<Map<String,Object>> getData() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<icon.length;i++){
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("image",icon[i]);
			map.put("text", iconname[i]);
			datalist.add(map);
		}
		Log.i("Main","size="+datalist.size());
		return datalist;
	}
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "I am"+iconname[arg2],Toast.LENGTH_LONG).show();
	}


}
