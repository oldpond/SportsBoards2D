package com.sportsboards2d;

import android.app.ListActivity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

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

public class Launcher extends ListActivity{
	String version;
	private LauncherMenuAdapter mListAdapter;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		 super.onCreate(savedInstanceState);
		 this.setContentView(R.layout.launcher_menu);

		 mListAdapter = new LauncherMenuAdapter(this); 
		 this.setListAdapter(mListAdapter);
		 try {
			    PackageInfo pInfo=getPackageManager().getPackageInfo(getPackageName(), 0);
			    version = pInfo.versionName;
			} catch (NameNotFoundException e) {
			    //Handle exception
			}
		 
		 final TextView txtVersion = (TextView)findViewById(R.id.text_version);
		 txtVersion.setText(version);
	}
	
	@Override
	protected void onListItemClick(ListView lv, View v, int position, long id){
		super.onListItemClick(lv, v, position, id);
		Activity act = (Activity) this.getListAdapter().getItem(position);
		this.startActivity(new Intent(this, act.Class));
		this.finish();
	}	
}