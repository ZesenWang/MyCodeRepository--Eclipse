package com.example.notificationtest;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {
	
	NotificationManager nm;
	NotificationCompat.Builder builder;
	int id = 0x12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        
        Intent intent = new Intent(MainActivity.this,MainActivity.class);
    	PendingIntent p = PendingIntent.getActivity(MainActivity.this,0,intent,0);
    	
        builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.drawable.ic_launcher);
        builder.setContentTitle("Yo birtch");
        builder.setContentText("From Breaking Bad");
        builder.setContentIntent(p);
        builder.setAutoCancel(true);
        builder.setDefaults(Notification.DEFAULT_ALL);
    }
    public void send(View v){
    	
    	Notification n = builder.build();
    	nm.notify(id, n);
    }
}
