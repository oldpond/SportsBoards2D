package com.sportsboards2d;

import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.entity.scene.Scene;
import org.anddev.andengine.entity.scene.Scene.ITouchArea;
import org.anddev.andengine.entity.scene.background.ColorBackground;
import org.anddev.andengine.extension.physics.box2d.PhysicsConnector;
import org.anddev.andengine.extension.physics.box2d.PhysicsFactory;
import org.anddev.andengine.input.touch.TouchEvent;
import org.anddev.andengine.opengl.font.FontFactory;
import org.anddev.andengine.opengl.texture.Texture;
import org.anddev.andengine.opengl.texture.TextureOptions;
import org.anddev.andengine.opengl.texture.region.TextureRegionFactory;
import org.anddev.andengine.util.MathUtils;

import android.graphics.Color;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;


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

public class testingboard extends BaseBoard{

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================
	
	@Override
	public Engine onLoadEngine() {
		SPORT_NAME = getString(R.string.basketball_string);
		BALL_PATH_SMALL = "Basketball_Ball_32.png";
		return super.onLoadEngine();
	}
	@Override
	public void onLoadResources() {
		super.onLoadResources();	
		this.mBackGroundTextureRegion = TextureRegionFactory.createFromAsset(this.mBackgroundTexture, this, "basketball_court.jpg", 0, 0);
		this.mMenuFontTexture = new Texture(256, 256, TextureOptions.BILINEAR_PREMULTIPLYALPHA);
		this.mMenuFont = FontFactory.createFromAsset(this.mMenuFontTexture, this, "VeraBd.ttf", 36, true, Color.WHITE);
		
		this.mEngine.getTextureManager().loadTextures(this.mBackgroundTexture, this.mMenuFontTexture);
		this.mEngine.getFontManager().loadFont(this.mMenuFont);
	}
	@Override
	public Scene onLoadScene(){
		super.onLoadScene();
		this.mMainScene.setBackground(new ColorBackground(100, 100, 100));
		
		return this.mMainScene;
	}
	
	public void reloadBall(){
		
		this.mBallTexture.clearTextureSources();
		this.mBallTextureRegion = TextureRegionFactory.createTiledFromAsset(this.mBallTexture, this, "Basketball_Ball_48.png", 0, 0, 1, 1);
		
	}
	
	@Override
	public void onLoadComplete() {

		this.mMainScene.getChild(BACKGROUND_LAYER).detachChildren();
		
		this.mMainScene.setBackground(new ColorBackground(100, 100, 100));
		
		Body body = null;
		
		clearScene();
		PlayerInfo info = new PlayerInfo(0, 0, "", "");
		Player p = new Player(0, "", new Coordinates(400,400), info);

		PlayerSprite newPlayer = createPlayer(p, this.mRedPlayerTextureRegion);

		body = PhysicsFactory.createBoxBody(this.mPhysicsWorld, newPlayer, BodyType.DynamicBody, FIXTURE_DEF);
		this.mPhysicsWorld.registerPhysicsConnector(new PhysicsConnector(newPlayer, body, true, true));

		this.mMainScene.getChild(PLAYER_LAYER).attachChild(newPlayer);
		this.mMainScene.registerTouchArea(newPlayer);
		
		
		//this.mMainScene.setChildScene(analog);

		//
		
	}
	
	
	@Override
	public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final ITouchArea pTouchArea, final float pTouchAreaLocalX, final float pTouchAreaLocalY) {

		PlayerSprite sprite = null; 
			
		//float[]Xs = null;
		//float[]Ys = null;
		
		float moveX, moveY;
		moveX = 0;
		moveY = 0;
		float diff;
		//float angleDeg = 0.0f;
	
		if((pTouchArea) instanceof PlayerSprite){
			
			sprite = (PlayerSprite) pTouchArea;
			selectedPlayer = sprite;
			Body body = this.mPhysicsWorld.getPhysicsConnectorManager().findBodyByShape(sprite);
			
			switch(pSceneTouchEvent.getAction()) {
				case TouchEvent.ACTION_DOWN:
					
					sprite.setScale(2.0f);	
					sprite.setmGrabbed(true);
					
					sprite.setStartX(sprite.getX());
					sprite.setStartY(sprite.getY());
					return true;
					
				case TouchEvent.ACTION_MOVE:
					
					if(sprite.ismGrabbed()) {
	
						sprite.setPosition(pSceneTouchEvent.getX(), pSceneTouchEvent.getY());
						body.setTransform(new Vector2(pSceneTouchEvent.getX()/32,  pSceneTouchEvent.getY()/32), 0);
						
						moveX = sprite.getX();
						moveY = sprite.getY();
						
						float relativeX = MathUtils.bringToBounds(0, sprite.getWidth(), pTouchAreaLocalX) / sprite.getWidth() - 0.5f;
						float relativeY = MathUtils.bringToBounds(0, sprite.getHeight(), pTouchAreaLocalY) / sprite.getHeight() - 0.5f;

						relativeX = relativeX * 2;
						relativeY = relativeY * 2;
						
						//angleDeg = MathUtils.radToDeg((float)Math.atan2(-relativeX, relativeY));

						if(true){
							
							diff = MathUtils.distance(sprite.getStartX(), sprite.getStartY(), moveX, moveY);
							
							if(diff > 30){
								sprite.setStartX(moveX);
								sprite.setStartY(moveY);
							}
						}
					}
					return true;
					
				case TouchEvent.ACTION_UP:
					
					if(sprite.ismGrabbed()) {
						sprite.setmGrabbed(false);
						sprite.setScale(1.0f);
					}
					return true;
				}
		}
		return false;
	}
}
