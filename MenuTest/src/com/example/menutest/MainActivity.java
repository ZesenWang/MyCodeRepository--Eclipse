package com.example.menutest;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity {
	
	final int SOUND = 0x111;
	final int IMAGE = 0x112;
	final int TEXT = 0x113;
	final int ANIMATION = 0x114;
	final int ABOUT = 0x115;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        SubMenu sub = menu.addSubMenu("Setting");
        
        sub.add(0,SOUND,0,"Sound");
        sub.add(0,IMAGE,0,"Image");
        sub.add(0,TEXT,0,"Text");
        sub.add(0,ANIMATION,0,"Animation");
        
        menu.add("About");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch(id){
        case SOUND:
        	Toast.makeText(this, "sound", Toast.LENGTH_SHORT).show();
        	break;
        case IMAGE:
        	Toast.makeText(this, "image", Toast.LENGTH_SHORT).show();
        	break;
        case TEXT:
        	Toast.makeText(this, "text", Toast.LENGTH_SHORT).show();
        	break;
        case ANIMATION:
        	Toast.makeText(this, "animation", Toast.LENGTH_SHORT).show();
        	break;
        }
        return true;
    }

}
