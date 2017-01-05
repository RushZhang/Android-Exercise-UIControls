package com.example.uicontrols;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

public class AtyUsingCheckBox extends Activity {
	
	private CheckBox checkBox1, checkBox2, checkBox3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_checkbox);
		checkBox1=(CheckBox)findViewById(R.id.checkBox1);
		checkBox2=(CheckBox)findViewById(R.id.checkBox2);
		checkBox3=(CheckBox)findViewById(R.id.checkBox3);
		findViewById(R.id.btnSubmit).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String string="中午要吃的有：\n";
				if(checkBox1.isChecked()){
					string+="肉饼";
				}if(checkBox2.isChecked()){
					string+="红烧肉";
				}if(checkBox3.isChecked()){
					string+="排骨";
				}
				new AlertDialog.Builder(AtyUsingCheckBox.this).setTitle("结果").setMessage(string).setPositiveButton("关闭", null).show();
			}
		});
		
		
	}
}
