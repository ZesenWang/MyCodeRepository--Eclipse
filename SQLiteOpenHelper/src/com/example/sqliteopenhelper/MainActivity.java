package com.example.sqliteopenhelper;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
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

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBOpenHelper helper=new DBOpenHelper(this,"stu.db");
        //helper.getReadableDatabase();
        SQLiteDatabase db=helper.getWritableDatabase();
        
        Cursor cursor=db.rawQuery("select * from stutb",null);
        
        if(cursor!=null){
        	String[] columns=cursor.getColumnNames();
        	
        	while(cursor.moveToNext()){
        		for(String name:columns)
        			Log.i("info",cursor.getString(cursor.getColumnIndex(name)));
        	}
        	//千万别忘了！！！！
        	cursor.close();
        }
      //千万别忘了！！！！
        db.close();
    }


}
