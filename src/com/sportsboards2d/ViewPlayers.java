package com.sportsboards2d;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


//This program is free software: you can redistribute it and/or modify
//it under the terms of the GNU General Public License as published by
//the Free Software Foundation, either version 3 of the License, or
//(at your option) any later version.
//
//This program is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.
//
//You should have received a copy of the GNU General Public License
//along with SportsBoards2D.  If not, see <http://www.gnu.org/licenses/>.

/**
 * Copyright 2011 5807400 Manitoba Inc. 
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
