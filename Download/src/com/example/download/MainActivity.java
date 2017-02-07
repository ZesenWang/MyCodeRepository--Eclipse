package com.example.download;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity {
	
	TextView tv;
	Handler handler = new Handler(){
		public void handleMessage(Message msg) {
			BookInfo book = (BookInfo)msg.obj;
			Toast.makeText(MainActivity.this,book.toString(), Toast.LENGTH_LONG).show();
		};
	};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView1);
        new Thread(){
        	public void run() {
        		try{
        			
        			String rawjson = getUrl("http://api.douban.com/v2/book/isbn/9787550272620");
        			Gson json = new Gson();
        			BookInfo book = json.fromJson(rawjson, BookInfo.class);
        			Message msg = handler.obtainMessage();
        			msg.obj= book;
        			msg.sendToTarget();
        			//Log.i("info",book.toString());
        			
        		}catch(IOException e){
        			e.printStackTrace();
        		}
        	}
        };
    }
    
    
    
    byte[] getUrlBytes(String urlSpec) throws IOException{
    	URL url = new URL(urlSpec);
    	HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    	
    	try{ByteArrayOutputStream out = new ByteArrayOutputStream();
    	InputStream in = connection.getInputStream();
    	
    	int bytesRead =0;
    	byte[] buffer = new byte[1024];
    	while((bytesRead=in.read(buffer))>0){
    		out.write(buffer,0,bytesRead);
    	}
    	out.close();
    	return out.toByteArray();
    	}finally{
    		connection.disconnect();
    	}
    }
    public String getUrl(String urlSpec) throws IOException{
    	return new String(getUrlBytes(urlSpec));
    }
}
