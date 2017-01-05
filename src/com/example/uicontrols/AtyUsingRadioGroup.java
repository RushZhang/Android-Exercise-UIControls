package com.example.uicontrols;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

public class AtyUsingRadioGroup extends Activity {
	
	private RadioButton radio1;
	private RadioButton radio2;
	private RadioButton radio3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_radiogroup);
		radio1=(RadioButton) findViewById(R.id.radio1);
		findViewById(R.id.btnSubmit).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(radio1.isChecked()){  //用这个方法
					new AlertDialog.Builder(AtyUsingRadioGroup.this).setTitle("判断").setMessage("回答正确").setPositiveButton("关闭", null).show();
				}else{
					new AlertDialog.Builder(AtyUsingRadioGroup.this).setTitle("判断").setMessage("回答错误").setPositiveButton("关闭", null).show();
				}
			}
		});
	}
}
