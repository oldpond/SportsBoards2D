package com.sportsboards2d;

import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.opengl.font.FontFactory;
import org.anddev.andengine.opengl.texture.Texture;
import org.anddev.andengine.opengl.texture.TextureOptions;
import org.anddev.andengine.opengl.texture.region.TextureRegionFactory;

import android.graphics.Color;


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
public class RingetteBoard extends BaseBoard{

	@Override
	public Engine onLoadEngine() {
		arrayID = R.array.hockey_positions;
		SPORT_NAME = getString(R.string.ringette_string);
		BALL_PATH_SMALL = "ring32.png";
		REF_PATH_SMALL = "referee_32.png";
		return super.onLoadEngine();
	}
	@Override
	public void onLoadResources() {
		super.onLoadResources();	
		this.mBackGroundTextureRegion = TextureRegionFactory.createFromAsset(this.mBackgroundTexture, this, "3Quarter_RINGETTE.jpg", 0, 0);
		this.mMenuFontTexture = new Texture(256, 256, TextureOptions.BILINEAR_PREMULTIPLYALPHA);
		this.mMenuFont = FontFactory.createFromAsset(this.mMenuFontTexture, this, "VeraBd.ttf", 36, true, Color.WHITE);
		this.mEngine.getTextureManager().loadTextures(this.mBackgroundTexture, this.mMenuFontTexture);
		this.mEngine.getFontManager().loadFont(this.mMenuFont);
	}
}
