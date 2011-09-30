package com.sportsboards2d;

import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.opengl.font.FontFactory;
import org.anddev.andengine.opengl.texture.Texture;
import org.anddev.andengine.opengl.texture.TextureOptions;
import org.anddev.andengine.opengl.texture.region.TextureRegionFactory;

import android.graphics.Color;


/**
 * Copyright 2011 5807400 Manitoba Inc. All rights reserved.
 */
public class FootballBoard extends BaseBoard {

	@Override
	public Engine onLoadEngine() {
		SPORT_NAME = getString(R.string.football_string);
		BALL_PATH_SMALL = "football.png";
		REF_PATH_SMALL = "referee_32.png";
		return super.onLoadEngine();
	}
	@Override
	public void onLoadResources() {
		super.onLoadResources();	
		this.mBackGroundTextureRegion = TextureRegionFactory.createFromAsset(this.mBackgroundTexture, this, "football_field.jpg", 0, 0);
		this.mMenuFontTexture = new Texture(256, 256, TextureOptions.BILINEAR_PREMULTIPLYALPHA);
		this.mMenuFont = FontFactory.createFromAsset(this.mMenuFontTexture, this, "VeraBd.ttf", 36, true, Color.WHITE);
		this.mEngine.getTextureManager().loadTextures(this.mBackgroundTexture, this.mMenuFontTexture);
		this.mEngine.getFontManager().loadFont(this.mMenuFont);
	}
}
