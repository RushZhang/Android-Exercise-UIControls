package com.example.uicontrols;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class AtyUsingProgressBar extends Activity {
	
	
	private ProgressBar pb;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_progressbar);
		pb=(ProgressBar) findViewById(R.id.progressBar2);
		pb.setMax(20);
//		pb.setProgress(10); //这个等于把进度设到一半，如果要动态的话应该要设置timer
	}
	
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		startTimer();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		stopTimer();
	}
	
	
	
	
	
	//=======下面是设置timer==========

	private int progress=0;
	
	public void startTimer(){
		if(timer==null){
			timer=new Timer();
			task=new TimerTask() {
	
				@Override
				public void run() {
					// TODO Auto-generated method stub
					progress++;
					pb.setProgress(progress);
				}
			};
			timer.schedule(task, 1000, 1000); 
		}
	}
	
	public void stopTimer(){
		if(timer!=null){
			task.cancel();
			timer.cancel();
			task=null;
			timer=null;
		}
	}
	
	private Timer timer=null;
	private TimerTask  task=null;
	
	
}
