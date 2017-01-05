package com.example.uicontrols;

import android.content.Context;
import android.content.Intent;

public class ListCellData {
	
	private Intent relatedIntent=null;
	private String controlName="";
	private Context context=null;

	public ListCellData(Context context, String controlName, Intent relatedIntent){
		this.controlName=controlName;
		this.context=context;
		this.relatedIntent=relatedIntent;
	}
	public String getControlName(){
		return controlName;
	}
	

	public Context getContext(){
		return context;
	}
	
	public Intent getRelatedIntent() {
		return relatedIntent;
	}
	
	public void startActivity(){
		getContext().startActivity(getRelatedIntent());
		//都是用context来发动intent的activity
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getControlName();
	}
}
