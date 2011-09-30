package com.sportsboards2d;

import org.anddev.andengine.ui.activity.BaseGameActivity;


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

enum Activity{

	/*
	 * List of Activities
	 */
	
	SOCCER(SoccerBoard.class, R.string.soccer_string),
	FOOTBALL(FootballBoard.class, R.string.football_string),
	BBALL(BBallBoard.class, R.string.basketball_string),
	HOCKEY(HockeyBoard.class, R.string.hockey_string),
	RINGETTE(RingetteBoard.class, R.string.ringette_string);	

	public final Class<? extends BaseGameActivity> Class;
	public final int id;
	
	private Activity(final Class<? extends BaseGameActivity> pActClass, final int pName){
		this.Class = pActClass;
		this.id = pName;
	}
	
}