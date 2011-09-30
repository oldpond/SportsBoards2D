package com.sportsboards2d;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


/**
 * Copyright 2011 5807400 Manitoba Inc. All rights reserved.
 */
public class ViewPlayers extends ListActivity{

	private boolean edit = false;
	@Override
	public void onCreate(Bundle bundle){
		
		 super.onCreate(bundle);
		 bundle = getIntent().getExtras();
		 setContentView(R.layout.viewplayers);		 
		 String[]list = getIntent().getStringArrayExtra("list");
		 setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));		 
		 ListView lv = getListView();
			
		 lv.setOnItemClickListener(new OnItemClickListener() {
			 @Override
			public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
			    	
				 if(edit == true){

				 }
				 setResult(position, null);
				 ViewPlayers.this.finish();
			 }
		 });
	}
	
	public void saveClicked(View v){}
	public void editClicked(View v){}
	public void exitClicked(View v){
		this.finish();
	}
}
