package com.sportsboards2d;


/**
 * Copyright 2011 5807400 Manitoba Inc. 
 */

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

/*
 * Each PlayerSprite has a Player. Each Player has a PlayerInfo
 */
public class Player extends PlayerEntry{

	private PlayerInfo pInfo;
	
	public Player(int pID, String pTeam, Coordinates xy, PlayerInfo pInfo) {
		super(pID, pTeam, xy);
		this.pInfo = pInfo;
	}
	public void setpInfo(PlayerInfo pInfo) {
		this.pInfo = pInfo;
	}
	public PlayerInfo getpInfo() {
		return pInfo;
	}
}
