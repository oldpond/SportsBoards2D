package com.sportsboards2d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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
/*
 * This is the main menu, you pick the field from here.
 */
class LauncherMenuAdapter extends BaseAdapter{

	private static final Activity[] Activities = {
		Activity.SOCCER,
		//Activity.FOOTBALL,
		Activity.BBALL,
		Activity.HOCKEY,
		Activity.RINGETTE,
	};
	
	private final Context mContext;
	
	public LauncherMenuAdapter(final Context context){
		this.mContext = context;
	}
	
	@Override
	public int getCount() {
		return Activities.length;
	}

	@Override
	public Activity getItem(int arg0) {
		return Activities[arg0];
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View view = null;
		
		if(convertView!=null){
			view = convertView;
		}
		else{
			view = LayoutInflater.from(this.mContext).inflate(R.layout.row, null);
		}
		
		((TextView)view.findViewById(R.id.tv_listrow_sport_name)).setText(this.getItem(position).id);
		return view;
	}
	
}