package com.example.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class AtyUsingGridView extends Activity {
	private ArrayAdapter<String> adapter;
	private GridView gridView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_gridview);
		adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
		gridView=(GridView)findViewById(R.id.gridView1);
		gridView.setAdapter(adapter);
		for(int i=0; i<50; i++){
			adapter.add("Dora "+i);
		}
	}
}
