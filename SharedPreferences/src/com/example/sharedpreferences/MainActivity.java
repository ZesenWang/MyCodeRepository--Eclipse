package com.example.sharedpreferences;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;
import android.preference.PreferenceManager;

public class MainActivity extends ActionBarActivity implements OnClickListener{
	
	EditText etusername;
	EditText etpassword;
	CheckBox chk;
	Editor editor;
	Button bt1;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //SharedPreferences pref=PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
//        SharedPreferences pref=getSharedPreferences("myPref",MODE_PRIVATE);
//        Editor editor=pref.edit();
//        editor.putString("name", "张三");
//        editor.putInt("age", 30);
//        editor.putLong("time", System.currentTimeMillis());
//        editor.putBoolean("default",true);
//        editor.commit();
//        editor.remove("default");
//        editor.commit();
//        System.out.println(pref.getString("name", "ooops"));
//        System.out.println(pref.getInt("age", 0));
        
        etusername=(EditText)findViewById(R.id.editText1);
        etpassword=(EditText)findViewById(R.id.editText2);
        chk=(CheckBox)findViewById(R.id.checkBox1);
        bt1=(Button)findViewById(R.id.button1);
        
        SharedPreferences pref=getSharedPreferences("userInfo",MODE_PRIVATE);
        editor=pref.edit();
        
        bt1.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String name=etusername.getText().toString().trim();
    	String password=etpassword.getText().toString().trim();
    	switch(v.getId()){
    	case R.id.button1:
    		if("admin".equals(name)&&"123456".equals(password))
    			if(chk.isChecked()){
    				editor.putString("username",name);
    				editor.commit();
    				Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
    			}
    		break;
    	default:
    		break;
    	}
	}


}
