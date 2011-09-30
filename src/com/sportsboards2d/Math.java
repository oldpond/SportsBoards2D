package com.sportsboards2d;

import org.anddev.andengine.util.MathUtils;

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
public class Math {

	
	public static float calculateDifference(float pX1, float pY1, float pX2, float pY2){
		
		return MathUtils.distance(pX1, pY1, pX2, pY2);
		
	}
	
	public static float calculateDifference(float x1, float x2){
		
		return x2-x1;
		
	}
	
	public static float calculateRotation(float x1, float y1, float x2, float y2){
		
		float xResult = java.lang.Math.abs(x2 - x1);
		float yResult = java.lang.Math.abs(y2 - y1);
		
		//float result = 
		
		return MathUtils.radToDeg((float)java.lang.Math.atan2(-yResult, xResult));
		
	}
	
}
