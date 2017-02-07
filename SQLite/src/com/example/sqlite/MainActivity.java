package com.example.sqlite;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
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
        
        SQLiteDatabase db=openOrCreateDatabase("user.db",MODE_PRIVATE,null);
        
        db.execSQL("create table if not exists usertb (_id integer primary key autoincrement, name text not null , age integer not null , sex text not null )");
        
        db.execSQL("insert into usertb(name,sex,age) values('张三','女',18)");
		db.execSQL("insert into usertb(name,sex,age) values('李四','女',19)");
		db.execSQL("insert into usertb(name,sex,age) values('王五','男',20)");
        
		Cursor c=db.rawQuery("select * from usertb",null);
		if(c!=null){
			//c.moveToFirst();
			while(c.moveToNext()){
				Log.i("info",""+c.getInt(c.getColumnIndex("_id")));
				Log.i("info",""+c.getString(c.getColumnIndex("name")));
				Log.i("info",""+c.getInt(c.getColumnIndex("age")));
				Log.i("info",""+c.getString(c.getColumnIndex("sex")));
				Log.i("info","**********************************");
			}
			c.close();
		}
		db.close();
    }


}
