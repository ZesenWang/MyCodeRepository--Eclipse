package com.jason.listview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	
	ArrayAdapter<String> arr_adapter;
	ListView lv;
	SimpleAdapter simp_adapter;
	List<Map<String,Object>> datalist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String data[]=new String[6];
        data[0]=new String("boy");
        data[1]=new String("girl");
        data[2]=new String("man");
        data[3]=new String("woman");
        data[4]=new String("lady");
        data[5]=new String("gentleman");
        //data={"boy","girl","man","woman","lady","gentleman"};
        
        arr_adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,data);
        datalist=new ArrayList<Map<String,Object>>();        
        simp_adapter=new SimpleAdapter(this,null, R.layout.item,new String[]{"pic","text"}, new int[]{R.id.imageview1,R.id.textview1});
    
        lv=(ListView)findViewById(R.id.listView1);
        
        lv.setAdapter(arr_adapter);
    }



}
