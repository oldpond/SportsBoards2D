package com.sportsboards2d;

import org.anddev.andengine.entity.text.ChangeableText;
import org.anddev.andengine.opengl.texture.region.TiledTextureRegion;

import android.util.Log;


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

public class PlayerSprite extends BaseSprite{
	
	private static final String TAG = "PlayerSprite";
	
	private final int NAME_DISPLAY = 0;
	private final int POSITION_DISPLAY = 1;
	private final int NUMBER_DISPLAY = 2;
	
	public static int displayMode;
	private final int NIP = 0;
	private final int NI = 1;
	private final int NP = 2;
	private final int N = 3;
	private final int IP = 4;
	private final int P = 5;
	private final int I = 6;
	
	/*
	 * Variables + Setters
	 */
	
	private Player player;
	public Player getPlayer(){ return player;}
	
	/*
	 * Constructors
	 */
	
	public PlayerSprite(Player player, float x, float y, TiledTextureRegion tex){
		super(x, y, tex);
		this.player = player;
	}

	public ChangeableText getNameDisplay() {
		return this.displayInfo.get(NAME_DISPLAY);
	}
	public ChangeableText getPositionDisplay(){
		return this.displayInfo.get(POSITION_DISPLAY);
	}
	public ChangeableText getNumberDisplay(){
		return this.displayInfo.get(NUMBER_DISPLAY);
	}
	
	public void swap(PlayerInfo swap){
		
		player.setpInfo(swap);
		player.setpID(swap.getpID());
		
		getNameDisplay().setText(player.getpInfo().getInitials());
		getPositionDisplay().setText(player.getpInfo().getType());
		getNumberDisplay().setText(String.valueOf(player.getpInfo().getjNum()));

	}
	
	public void displayInfo(boolean bool){
		
		this.detachChildren();
		
		if(bool){
			
			//+10, -20, TOP
			//+50, +10, RIGHT
			//+10, +50, BOTTOM
			
			
			
			switch(displayMode){
			
				case NIP:
					this.attachChild(getNameDisplay());
					this.attachChild(getPositionDisplay());
					this.attachChild(getNumberDisplay());
					break;
				case NI:
					this.attachChild(getNameDisplay());
					this.attachChild(getNumberDisplay());
					break;
				case NP:
					this.attachChild(getPositionDisplay());
					this.attachChild(getNumberDisplay());
					break;
				case N:
					this.attachChild(getNumberDisplay());
					break;
				case IP:
					this.attachChild(getNameDisplay());
					this.attachChild(getPositionDisplay());
					break;
				case I:
					this.attachChild(getPositionDisplay());
					break;
				case P:
					//this.setPosition(+10, +15);
					this.attachChild(getNameDisplay());
					break;
			}
			
		}
	}
}