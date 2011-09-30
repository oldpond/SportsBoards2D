package com.sportsboards2d;

//what is this for

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
public class MenuTextSettings {

	public static float onSelectR;
	public static float onSelectG;
	public static float onSelectB;
	public static float unSelectR;
	public static float unSelectG;
	public static float unSelectB;
	
	public static void setColor(int id){
		
		switch(id){
			case Colors.WHITE:
				onSelectR = 1.0f;
				onSelectG = 1.0f;
				onSelectB = 1.0f;
				unSelectR = 0.0f;
				unSelectG = 1.0f;
				unSelectB = 0.0f;
				break;
			case Colors.BLACK:
				onSelectR = 0.0f;
				onSelectG = 0.0f;
				onSelectB = 0.0f;
				unSelectR = 1.0f;
				unSelectG = 0.0f;
				unSelectB = 0.0f;
				break;	
			case Colors.RED:
				onSelectR = 1.0f;
				onSelectG = 0.0f;
				onSelectB = 0.0f;
				unSelectR = 0.0f;
				unSelectG = 0.0f;
				unSelectB = 1.0f;
				break;
			case Colors.GREEN:
				onSelectR = 0.0f;
				onSelectG = 1.0f;
				onSelectB = 0.0f;
				unSelectR = 1.0f;
				unSelectG = 1.0f;
				unSelectB = 1.0f;
				break;
			case Colors.BLUE:
				onSelectR = 0.0f;
				onSelectG = 0.0f;
				onSelectB = 1.0f;
				unSelectR = 1.0f;
				unSelectG = 0.0f;
				unSelectB = 0.0f;
				break;
			case Colors.ORANGE:
				onSelectR = 1.0f;
				onSelectG = 0.38f;
				onSelectB = 0.0f;
				unSelectR = 0.0f;
				unSelectG = 0.0f;
				unSelectB = 0.0f;
				break;
			case Colors.GREY:
				onSelectR = 0.6f;
				onSelectG = 0.6f;
				onSelectB = 0.6f;
				unSelectR = 1.0f;
				unSelectG = 0.0f;
				unSelectB = 0.0f;
				break;
			case Colors.YELLOW:
				onSelectR = 1.0f;
				onSelectG = 1.0f;
				onSelectB = 0.0f;
				unSelectR = 1.0f;
				unSelectG = 1.0f;
				unSelectB = 1.0f;
				break;
		}
	}
}
