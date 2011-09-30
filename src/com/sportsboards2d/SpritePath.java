package com.sportsboards2d;

import org.anddev.andengine.entity.modifier.PathModifier;
import org.anddev.andengine.entity.sprite.AnimatedSprite;


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
public class SpritePath {
	
	private AnimatedSprite sprite;
	private PathModifier.Path path;
	
	public SpritePath(AnimatedSprite sprite, PathModifier.Path path1){
		this.setSprite(sprite);
		this.setPath(path1);
	}

	public void setSprite(AnimatedSprite sprite) {
		this.sprite = sprite;
	}

	public AnimatedSprite getSprite() {
		return sprite;
	}

	public void setPath(PathModifier.Path path) {
		this.path = path;
	}

	public PathModifier.Path getPath() {
		return path;
	}

}
