package com.example.uicontrols;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class AtyUsingProgressDialog extends Activity {
	
	private ProgressDialog progressDialog;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_progressdialog);
		findViewById(R.id.btnShowProgressDialog).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				progressDialog=ProgressDialog.show(AtyUsingProgressDialog.this, "加载", "正在加载");
				new Thread(){
					public void run(){
						try {
							Thread.sleep(3000);
							progressDialog.dismiss();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					};
				}.start();
			}
		});
	}
}
