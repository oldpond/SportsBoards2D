package com.sportsboards2d;

import org.anddev.andengine.entity.primitive.Line;
	
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
public class LineFactory {
	
	private static final float LINEWIDTH_DEFAULT = 5.0f;

	private static float pRed = 100.0f;
	private static float pGreen = 100.0f;
	private static float pBlue = 100.0f;
	
	public static Line createLine(float pStartX, float pStartY, float pEndX, float pEndY){
		Line line = new Line(pStartX, pStartY, pEndX, pEndY, LINEWIDTH_DEFAULT);
		line.setColor(pRed, pGreen, pBlue);
		return line;
	}
	
	public static Line createLine(float pStartX, float pStartY, float pEndX, float pEndY, float line_width){
		Line line = new Line(pStartX, pStartY, pEndX, pEndY, line_width);
		line.setColor(pRed, pGreen, pBlue);
		return line;
	}
	
	public static void setColor(int id){
		switch(id){
		
			case Colors.WHITE:
				pRed = 1.0f;
				pGreen = 1.0f;
				pBlue = 1.0f;
				break;
			case Colors.BLACK:
				pRed = 0.0f;
				pGreen = 0.0f;
				pBlue = 0.0f;
				break;	
			case Colors.RED:
				pRed = 1.0f;
				pGreen = 0.0f;
				pBlue = 0.0f;
				break;
			case Colors.GREEN:
				pRed = 0.0f;
				pGreen = 1.0f;
				pBlue = 0.0f;
				break;
			case Colors.BLUE:
				pRed = 0.0f;
				pGreen = 0.0f;
				pBlue = 1.0f;
				break;
			case Colors.ORANGE:
				pRed = 1.0f;
				pGreen = 0.38f;
				pBlue = 0.0f;
				break;
			case Colors.GREY:
				pRed = 0.6f;
				pGreen = 0.6f;
				pBlue = 0.6f;
				break;
			case Colors.YELLOW:
				pRed = 1.0f;
				pGreen = 1.0f;
				pBlue = 0.0f;
				break;
		}	
	}
}
