package com.example.progressdialog;

import java.util.Random;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {
	
	Handler handler = new Handler(){
		public void handleMessage(android.os.Message msg) {
			
			dialog.setProgress(progressStatus);
			progressStatus++;
			
		};
	};
	ProgressDialog dialog;
	int MAX_PROGRESS = 100;
	int progressStatus = 0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);        
    }

    public void showProgress(View source){
    	progressStatus = 0;
    	dialog = new ProgressDialog(this);
    	dialog.setTitle("Pending");
    	dialog.setIcon(R.drawable.evernote);
    	dialog.setMax(MAX_PROGRESS);
    	dialog.setMessage("耗时任务的完成百分比");
    	dialog.setCancelable(false);
    	dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
    	dialog.setIndeterminate(true);
    	dialog.show();
    	new Thread(){
    		public void run() {
    			Random r = new Random();
    			int time;
    			while(progressStatus<MAX_PROGRESS){
    				
        			time = r.nextInt(300);
        			try {
						Thread.sleep(time);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        			handler.sendEmptyMessage(0x123);
        			
        			if(progressStatus>=MAX_PROGRESS){
        				dialog.dismiss();
        			}
        		}
    		};
    	}.start();
    }
   

}
