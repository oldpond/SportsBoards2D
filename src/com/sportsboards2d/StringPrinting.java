package com.sportsboards2d;

import java.util.List;

import android.util.Log;

/**
 * Coded by Nathan King
 */

/**
 * Copyright 2011 5807400 Manitoba Inc. All rights reserved.
 */
public class StringPrinting {
	
	private static final String TAG = "StringPrinting";
	
	public static void printForm(FormationObject fn){
		
		Log.d(TAG, "Xball: " + fn.getBall().getX());
		Log.d(TAG, "Yball: " + fn.getBall().getY());
		Log.d(TAG, fn.getfName());
		
		List<PlayerObject>players = fn.getPlayers();
		
		//Player p 
		
		for(PlayerObject p:players){
			Log.d(TAG, "ID: " + p.getpID());
			Log.d(TAG, "Team: " + ((Player)p).getpTeam());
		}

	}
	
	public static void printAllFormation(List<FormationObject> forms){
		
		for(FormationObject fn:forms){
			Log.d(TAG, fn.getfName());
			Log.d(TAG, fn.getBall().getX() + " " + fn.getBall().getY());
			
			for(PlayerObject p:fn.getPlayers()){
				Log.d(TAG, String.valueOf(((Player) p).getX()));
				Log.d(TAG, String.valueOf(p.getpID()));
			}
			
			Log.d(TAG, String.valueOf(fn.getPlayers().size()));
		}
	}
	
	public static void printPlayerInfo(PlayerInfo player){
		
		Log.d(TAG, "Player name: " + player.getPName());
		Log.d(TAG, "Player ID: " + player.getpID());
		Log.d(TAG, "Player jersey#: " + player.getjNum());
		Log.d(TAG, "Player position: " + player.getType());
	}

}
