package com.example.uicontrols;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {  //这里把activity换为list
	
	private ArrayAdapter<ListCellData> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		adapter=new ArrayAdapter<ListCellData>(this, android.R.layout.simple_list_item_1);
		setListAdapter(adapter);
		adapter.add(new ListCellData(this, "RadioGroup", new Intent(this, AtyUsingRadioGroup.class)));
		adapter.add(new ListCellData(this, "CheckBox", new Intent(this, AtyUsingCheckBox.class)));
		adapter.add(new ListCellData(this, "DatePicker", new Intent(this, AtyUsingDatePicker.class)));
		adapter.add(new ListCellData(this, "ProgressBar", new Intent(this, AtyUsingProgressBar.class)));
		adapter.add(new ListCellData(this, "GridView", new Intent(this, AtyUsingGridView.class)));
		adapter.add(new ListCellData(this, "ProgressDialog", new Intent(this, AtyUsingProgressDialog.class)));
		adapter.add(new ListCellData(this, "Notification", new Intent(this, AtyUsingNotification.class)));
		adapter.add(new ListCellData(this, "ScrollView", new Intent(this, AtyUsingScrollView.class)));
		adapter.add(new ListCellData(this, "RatingBar", new Intent(this, AtyUsingRatingBar.class)));
		adapter.add(new ListCellData(this, "ImageSwitcher", new Intent(this, AtyUsingImageSwitcher.class)));
		adapter.add(new ListCellData(this, "Gallery", new Intent(this, AtyUsingGallery.class)));
		adapter.add(new ListCellData(this, "AutoCompleteText", new Intent(this, AtyUsingAutoCompleteTextView.class)));
		
	}
	
	
	
	//要设置listview的监听器，要这样子写
	protected void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
		ListCellData data=adapter.getItem(position);
		data.startActivity(); //这个activity是自定义数据结构里自己设置的
		super.onListItemClick(l, v, position, id);
	};
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.About:
			new AlertDialog.Builder(this).setTitle("About").setMessage("This is one of my Android exercise, together with several UI components, displayed different component").setPositiveButton("Close", null).show();
			break;
		
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}
