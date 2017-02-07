package com.example.datepickerandtimepicker;

import java.util.Calendar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.TimePicker;
import android.widget.TimePicker.OnTimeChangedListener;
import android.os.Build;

public class MainActivity extends Activity {
	TimePicker tp1;
	DatePicker dp1;
	Calendar cal;
	int year;
	int month;
	int date;
	int hour;
	int minute;
	int second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        tp1=(TimePicker)findViewById(R.id.timePicker1);
        dp1=(DatePicker)findViewById(R.id.datePicker1);
        
        cal=Calendar.getInstance();
        
        year=cal.get(Calendar.YEAR);
        month=cal.get(Calendar.MONTH);
        date=cal.get(Calendar.DAY_OF_MONTH);
        hour=cal.get(Calendar.HOUR_OF_DAY);
        minute=cal.get(Calendar.MINUTE);
        second=cal.get(Calendar.SECOND);
        int mon=month+1;
        
        setTitle(year+"-"+mon+"-"+date+"-"+hour+"-"+minute+"-"+second);
        
        dp1.init(year, month, date, new OnDateChangedListener(){
        	@Override
        	public void onDateChanged(DatePicker view,int year,int monthOfYear,
        			int dayOfMonth){
        		int mon=monthOfYear+1;
        		setTitle(year+"-"+mon+"-"+dayOfMonth);
        	}
        	
        });
        tp1.setOnTimeChangedListener(new OnTimeChangedListener(){

			@Override
			public void onTimeChanged(TimePicker arg0, int arg1, int arg2) {
				// TODO Auto-generated method stub
				setTitle(arg1+":"+arg2);
			}
        	
        });
        new DatePickerDialog(this,new OnDateSetListener(){

			@Override
			public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
				setTitle(arg1+"-"+arg2+"-"+arg3);
			}
        	
        },year,month,date).show();
    }



}
