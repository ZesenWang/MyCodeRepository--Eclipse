package com.example.alertdialog;

import android.app.Activity;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends Activity {
	
	Button bt;
	AlertDialog dialog;
	AlertDialog.Builder builder;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Annoying a = new Annoying();
        caocaocao b = new caocaocao();
        
        bt = (Button)findViewById(R.id.button1);
        bt.setOnClickListener(b);
        builder = new AlertDialog.Builder(this).
        		setTitle("Œ“œÎ∫»ƒÃ≤Ë").setIcon(R.drawable.digg).setMessage("√ª«Æ:(").
        		setPositiveButton("haha", a).setNegativeButton("hehe",a);
        		
        
    }

    class Annoying implements DialogInterface.OnClickListener{

		

		@Override
		public void onClick(DialogInterface arg0, int arg1) {
			// TODO Auto-generated method stub
			AlertDialog fuck = builder.create();
			fuck.show();
		}
    	
    }
    class caocaocao implements OnClickListener{
    	@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog fuck = builder.create();
			fuck.show();
		}
    }
}
