package com.example.uicontrols;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.location.GpsStatus.NmeaListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class AtyUsingNotification extends Activity {
	
	private NotificationManager nm;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_notification);
		nm=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE); //固定搭配
		nm.cancel(R.layout.aty_using_notification); //点击取消通知
		findViewById(R.id.btnShowNotification).setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Notification n=new Notification(R.drawable.ic_launcher, "Ticker Text", System.currentTimeMillis());
				n.setLatestEventInfo(AtyUsingNotification.this, "Title", "Content", PendingIntent.getActivity(AtyUsingNotification.this, 1, getIntent(), 0));
				nm.notify(R.layout.aty_using_notification, n);
			}
		});
	}
}
