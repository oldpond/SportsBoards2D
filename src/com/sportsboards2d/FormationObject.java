package com.sportsboards2d;

import java.util.List;


/**
 * Copyright 2011 5807400 Manitoba Inc. All rights reserved.
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
