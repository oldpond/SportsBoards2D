package com.sportsboards2d;


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
 * This class is used when reading/writing to the database
 */
public class PlayerEntry extends PlayerObject{
	
	private String pTeam;
	private Coordinates coords;
	
	public PlayerEntry(int pID, String pTeam, Coordinates coords){
		super(pID);
		this.setpTeam(pTeam);
		this.setCoords(coords);
	}
	
	public void setpTeam(String pTeam) {
		this.pTeam = pTeam;
	}
	public String getpTeam() {
		return pTeam;
	}
	public void setCoords(Coordinates coords) {
		this.coords = coords;
	}
	public Coordinates getCoords() {
		return coords;
	}

	public void setX(float x) {
		this.coords.setX(x);
	}

	public float getX() {
		return this.coords.getX();
	}

	public void setY(float y) {
		this.coords.setY(y);
	}

	public float getY() {
		return this.coords.getY();
	}
}
