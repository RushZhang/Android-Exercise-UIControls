package com.example.uicontrols;

import android.R.anim;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher.ViewFactory;

public class AtyUsingImageSwitcher extends Activity {  //imageSwitcher还能设置切换效果
	
	private ImageSwitcher is;
	private int showImg1=1;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_imageswitcher);
		is=(ImageSwitcher) findViewById(R.id.imageSwitcher1);
		is.setFactory(new ViewFactory() {  //还需要这样一个工厂
			
			@Override
			public View makeView() {
				// TODO Auto-generated method stub
				return new ImageView(AtyUsingImageSwitcher.this);
			}
		});
		is.setInAnimation(AnimationUtils.loadAnimation(AtyUsingImageSwitcher.this, anim.fade_in));
		is.setOutAnimation(AnimationUtils.loadAnimation(AtyUsingImageSwitcher.this, anim.fade_out));
		is.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.out.println(showImg1);
				if(showImg1==5) showImg1=1;
				else showImg1++;
				showCurrentImage();
			}
		});
		showCurrentImage();
	}
	
	private void showCurrentImage(){
		if(showImg1==1){
			is.setImageResource(R.drawable.dora1);
		} else if(showImg1==2){
			is.setImageResource(R.drawable.dora2);
		} else if(showImg1==3){
			is.setImageResource(R.drawable.dora3);
		} else if(showImg1==4){
			is.setImageResource(R.drawable.dora4);
		} else{
			is.setImageResource(R.drawable.dora5);
		}
	}
}
