package com.example.sqlite2;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        SQLiteDatabase db=openOrCreateDatabase("stu.db",MODE_PRIVATE,null);
        db.execSQL("create table if not exists stutb(_id integer primary key autoicrement,name text not null,sex text not null,age integer not null)");
        
        ContentValues values=new ContentValues();
        values.put("name", "张三0");
        values.put("sex", "男");
        values.put("age", 18);
        db.insert("stutb",null,values);
        values.clear();
        values.put("name", "张三1");
        values.put("sex", "男");
        values.put("age", 18);
        db.insert("stutb",null,values);
        values.clear();
        values.put("name", "张三2");
        values.put("sex", "男");
        values.put("age", 18);
        db.insert("stutb",null,values);
        values.clear();
        values.put("name", "张三3");
        values.put("sex", "男");
        values.put("age", 18);
        db.insert("stutb",null,values);
        values.clear();
        values.put("name", "张三4");
        values.put("sex", "男");
        values.put("age", 18);
        db.insert("stutb",null,values);
        values.clear();
        values.put("sex", "女");
        db.update("stutb", values,"_id>?", new String[]{"3"});
        db.delete("stutb", "name like?", new String[]{"%1%"});
        
        Cursor c = db.query("stutb",null,"_id>?",new String[]{"0"},null,null,"name");
        if(c!=null){
        	String [] columns=c.getColumnNames();
        	while(c.moveToNext()){
        		for(String columnname:columns){
        			Log.i("info",c.getString(c.getColumnIndex(columnname)));
        		}
        	}
        	c.close();
        }
        db.close();
    }


    
}
