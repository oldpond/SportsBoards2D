package com.sportsboards2d;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;

import android.util.Log;
import android.util.Xml;

/**
 * Coded by Nathan King
 */

/**
 * Copyright 2011 5807400 Manitoba Inc. All rights reserved.
 */

public class XMLReader extends BaseFeedParser{
	
	private static final String TAG = "XMLReader";
	
	public XMLReader(){}
	
	@Override
	public List<FormationObject> parseFormation(InputStream input){

		List<FormationObject> entries = null;
		List<PlayerObject> players = null;
		
		PlayerEntry pEntry;
		FormationObject fEntry;
		
		String formName = "", pTeam = "";
		int pID = 0;
		float xBall = 0.0f, yBall = 0.0f, xPlayer = 0.0f, yPlayer = 0.0f, xRef = 0.0f, yRef = 0.0f;
		
		XmlPullParser parser = Xml.newPullParser();
		
		try {
            parser.setInput(input, null);
            int eventType = parser.getEventType();
            boolean done = false;
            
            while (eventType != XmlPullParser.END_DOCUMENT && !done){
                String name = null;
                switch (eventType){
                    case XmlPullParser.START_DOCUMENT:
                        break;
                    case XmlPullParser.START_TAG:
                    	
                        name = parser.getName();
                        
                        if (name.equalsIgnoreCase(FORMS)){
                            entries = new ArrayList<FormationObject>();
                        } 
                        else if (name.equalsIgnoreCase(FORM)){
                        	players = new ArrayList<PlayerObject>();
                        }
                        else if (name.equalsIgnoreCase(FNAME)){
                        	formName = parser.nextText();
                        	
                        }
                        else if (name.equalsIgnoreCase(BALL)){                           	
                        	xBall = Float.parseFloat(parser.getAttributeValue(0));
                        	yBall = Float.parseFloat(parser.getAttributeValue(1));
                        }
                        else if (name.equalsIgnoreCase(REF)){                           	
                        	xRef = Float.parseFloat(parser.getAttributeValue(0));
                        	yRef = Float.parseFloat(parser.getAttributeValue(1));
                        }
                        
                        else if (name.equalsIgnoreCase(PID)){
                        	pID = Integer.parseInt(parser.getAttributeValue(0));
                        }
                        else if (name.equalsIgnoreCase(PTEAM)){
                        	pTeam = parser.nextText();
                        }
                        else if (name.equalsIgnoreCase(PCOORDS)){
                        	xPlayer = Float.parseFloat(parser.getAttributeValue(0));
                        	yPlayer = Float.parseFloat(parser.getAttributeValue(1));
                        }
                        break;
                        	
                        
                    case XmlPullParser.END_TAG:
                    	
                        name = parser.getName();
                        
                        if (name.equalsIgnoreCase(FORM)){
                        	
                        	fEntry = new FormationObject(formName, new Coordinates(xBall, yBall), new Coordinates(xRef, yRef), players);
                        	entries.add(fEntry);
                            Log.d(TAG, fEntry.getPlayers().size() + " players in this formation");

                        }
                        else if (name.equalsIgnoreCase(PENTRY)){
                        	pEntry = new PlayerEntry(pID, pTeam, new Coordinates(xPlayer, yPlayer));
                        	players.add(pEntry);
                        }
                        break;                       
                }                
                eventType = parser.next();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		return entries;
	}

	@Override
	public List<PlayerInfo> parsePlayers(InputStream input){
		
		ArrayList<PlayerInfo> pList = new ArrayList<PlayerInfo>();		
		PlayerInfo newPlayer = null;
		int id = 0, num = 0;
		String type = null, pName = null;
		XmlPullParser parser = Xml.newPullParser();
		try {
            // auto-detect the encoding from the stream
            parser.setInput(input, null);  
            int eventType = parser.getEventType();   
            boolean done = false;
            
            while (eventType != XmlPullParser.END_DOCUMENT && !done){
                String name = null;
                switch (eventType){
                
                    case XmlPullParser.START_DOCUMENT:
                    	pList = new ArrayList<PlayerInfo>();
                        break;
                    case XmlPullParser.START_TAG:
                        name = parser.getName();
              
                        if(name.equalsIgnoreCase(PID)){	
                        	id = Integer.parseInt(parser.getAttributeValue(0));
                        }
                        else if(name.equalsIgnoreCase(JNUM)){
                        	num = Integer.parseInt(parser.getAttributeValue(0));
                        }
                        else if(name.equalsIgnoreCase(TYPE)){
                        	type = parser.nextText();
                        }
                        else if(name.equalsIgnoreCase(PNAME)){                       	
                        	pName = parser.nextText();
                        }                        
                        break;
                        
                    case XmlPullParser.END_TAG:
                    	
                        name = parser.getName();
                        
                        if(name.equalsIgnoreCase(PLAYER)){                        	
                            newPlayer = new PlayerInfo(id, num, type, pName);
                            pList.add(newPlayer);
                        }
                    
                        break;
                }
                eventType = parser.next();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }		
		return pList;
	}
}