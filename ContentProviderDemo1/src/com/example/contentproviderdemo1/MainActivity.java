package com.example.contentproviderdemo1;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;



public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContentResolver cr=getContentResolver();
        
        Cursor c=cr.query(Contacts.CONTENT_URI, 
        		new String[]{Contacts._ID,Contacts.DISPLAY_NAME},
        		null,null,null);
        if(c!=null){
        	while(c.moveToNext()){
        		int id=c.getInt(c.getColumnIndex(Contacts._ID));
        		
        		Log.i("info",""+id);
        		Log.i("info",""+c.getString(c.getColumnIndex(Contacts.DISPLAY_NAME)));
        		
        		Cursor c1=cr.query(Phone.CONTENT_URI, new String[]{Phone.NUMBER,Phone.TYPE}, Phone.CONTACT_ID, null, null);
        		
        		if(c1!=null){
        			while(c1.moveToNext()){
        				
        				int type=c1.getInt(c1.getColumnIndex(Phone.TYPE));
        				
        				if(type==Phone.TYPE_HOME){
        					Log.i("info","home"+c1.getString(c1.getColumnIndex(Phone.NUMBER)));
        					
        				}else if(type==Phone.TYPE_MOBILE){
        					Log.i("info","mobile"+c1.getString(c1.getColumnIndex(Phone.NUMBER)));
        				}
        			}
        		}
        		c1.close();
        		Cursor c2=cr.query(Email.CONTENT_URI, new String[]{Email.DATA,Email.TYPE}, Email.CONTACT_ID+"="+id, null, null);
        		c2.close();
        	}
        	c.close();
        	
        }
        
    }


  
}
