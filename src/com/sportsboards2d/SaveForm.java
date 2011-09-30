package com.sportsboards2d;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
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
public class SaveForm extends ListActivity{
 
	@Override
	public void onCreate(Bundle savedInstanceState){
		
		 super.onCreate(savedInstanceState);
		 setContentView(R.layout.saveformation);
		 String[]list = getIntent().getStringArrayExtra("list");
		 setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
		 ListView lv = getListView();
		 lv.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
				setResult(position, null);
				SaveForm.this.finish();
			}
		 });
	}
	
	public void saveClicked(View v){
		Intent intent = new Intent();
		EditText name = (EditText) findViewById(R.id.enter_form_name);
		intent.setType(name.getText().toString());
		setResult(1, intent);
		SaveForm.this.finish();
	}
}
