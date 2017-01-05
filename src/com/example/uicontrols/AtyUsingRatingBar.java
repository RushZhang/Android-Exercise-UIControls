package com.example.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Toast;

public class AtyUsingRatingBar extends Activity {
	
	private RatingBar ratingBar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_ratingbar);
		ratingBar=(RatingBar)findViewById(R.id.ratingBar1);
		ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
				// TODO Auto-generated method stub
				Toast.makeText(AtyUsingRatingBar.this, "评价为："+rating, Toast.LENGTH_LONG).show();
			}
		});
	}
}
