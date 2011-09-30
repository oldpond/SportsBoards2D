package com.sportsboards2d;

import org.anddev.andengine.entity.scene.menu.item.IMenuItem;
import org.anddev.andengine.entity.text.ChangeableText;
import org.anddev.andengine.opengl.font.Font;

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
public class ChangeableTextMenuItem extends ChangeableText implements IMenuItem{
	
	private final int mID;
	
	public ChangeableTextMenuItem(final int pID, final Font pFont, final String pText) {
		super(0, 0, pFont, pText);
		this.mID = pID;
	}
	public ChangeableTextMenuItem(final int pID, final Font pFont, final String pText, final int pMaxLenght) {
		super(0, 0, pFont, pText, pMaxLenght);
		this.mID = pID;
	}
	@Override
	public void setText(String pText){
		super.setText(pText);
	}
	@Override
	public int getID(){
		return this.mID;
	}
	@Override
	public void onSelected(){}
	@Override
	public void onUnselected(){}
}

	