package com.sportsboards2d;

import android.os.Parcel;
import android.os.Parcelable;


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

/*
 * This class stores data unique to the player
 */

public class PlayerInfo extends PlayerObject implements Parcelable{
	
	/*
	 * Variables + Getters/Setters
	 */
	
	private int jNum;
	private String type;
	private String pName;
	
	/*
	 * Constructors
	 */
	
	public PlayerInfo(int id, int num, String type, String name){
		
		super(id);
		this.setjNum(num);
		this.setType(type);
		this.pName = name;
	}
	
	public String getFirstName(){
		String[]result;
		result = pName.split("\\s+");
		return result[0];
	}
	
	public String getLastName(){
		String[]result;
		result = pName.split("\\s+");
		try{
			return result[1];
		}
		catch(ArrayIndexOutOfBoundsException oshit){
			return "";
		}
	}
	
	public String getInitials(){
		
		String result = "";
		
		for(int i = 0; i < this.pName.length()-1; i++){
			if(Character.isUpperCase(this.pName.charAt(i))){
				result += this.pName.charAt(i);
			}
		}
		return result;
	}
	
	public void setjNum(int jNum) {
		this.jNum = jNum;
	}
	public int getjNum() {
		return jNum;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}

	public void setPName(String pName) {
		this.pName = pName;
	}

	public String getPName() {
		return pName;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int arg1) {
		out.writeInt(this.getpID());
		out.writeInt(jNum);
		out.writeString(type);
		out.writeString(pName);
		
	}
	public static final Parcelable.Creator<PlayerInfo> CREATOR = new Parcelable.Creator<PlayerInfo>() {
        @Override
		public PlayerInfo createFromParcel(Parcel in) {
            return new PlayerInfo(in);
        }

        @Override
		public PlayerInfo[] newArray(int size) {
            return new PlayerInfo[size];
        }
    };
    private PlayerInfo(Parcel in) {
        super(in.readInt());
        this.jNum = in.readInt();
        this.type = in.readString();
        this.pName = in.readString();
    }
}