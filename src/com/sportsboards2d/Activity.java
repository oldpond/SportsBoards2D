package com.sportsboards2d;

import org.anddev.andengine.ui.activity.BaseGameActivity;


/**
 * Coded by Nathan King
 */

/**
 * Copyright 2011 5807400 Manitoba Inc. All rights reserved.
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