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

public abstract class BaseFeedParser implements FeedParser{
	
	//XML tag names
	
	//formation tags
	static final String FORMS = "forms";
	static final String FORM = "form";
	static final String FNAME = "name";
	static final String BALL = "ball";
	static final String REF = "ref";
	static final String PENTRY = "pEntry";
	
	static final String PID = "pID";

	static final String PTEAM = "team";
	static final String PCOORDS = "coords";
	
	//config tags
	static final String CONFIG = "config";
	static final String LINE_ENABLED = "line_enabled";
	static final String LOAD_LAST = "last_loaded";
	static final String PLAYER_SIZE = "player_size";
	static final String DEFAULT = "default_sport";
	
	//player tags
	static final String PLAYERS = "players";
	static final String PLAYER = "player";
	static final String JNUM = "jNum";
	static final String TYPE = "type";
	static final String PNAME = "pName";

	
}