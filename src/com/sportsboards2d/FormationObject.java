package com.sportsboards2d;

import java.util.List;

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
public class FormationObject {
	// record of one Formation object. Stores the name, the coordinates of the
	// ball, and
	// an array of all the players.
	private String fName;
	private Coordinates mBall;
	private Coordinates mRef;
	private List<PlayerObject> players;

	public FormationObject(String fName, Coordinates mBall, Coordinates mRef, List<PlayerObject> players) {
		this.fName = fName;
		this.mBall = mBall;
		this.mRef = mRef;
		this.players = players;
	}

	public void setBall(Coordinates mBall) {
		this.mBall = mBall;
	}

	public Coordinates getBall() {
		return mBall;
	}

	public void setRef(Coordinates mRef) {
		this.mRef = mRef;
	}

	public Coordinates getRef() {
		return mRef;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfName() {
		return fName;
	}

	public void setPlayers(List<PlayerObject> players) {
		this.players = players;
	}

	public List<PlayerObject> getPlayers() {
		return players;
	}
}
