package com.playClasses;

public abstract class MusicAbstractClass {
	
	boolean highRange;
	boolean lowRange;
	String musicGroup;
	
	abstract String musicSoundRange();
	abstract Double musicInstrumentCost();
	
	public String musicGrouping(String musicGroup) {
		return musicGroup;
	}
	
	public boolean highRange(boolean highRange) {
		return highRange;
	}
	
	public boolean lowRange(boolean lowRange) {
		return lowRange;
	}
	
	
	
	public boolean isHighRange() {
		return highRange;
	}
	public void setHighRange(boolean highRange) {
		this.highRange = highRange;
	}
	public boolean isLowRange() {
		return lowRange;
	}
	public void setLowRange(boolean lowRange) {
		this.lowRange = lowRange;
	}
	public String getMusicGroup() {
		return musicGroup;
	}
	public void setMusicGroup(String musicGroup) {
		this.musicGroup = musicGroup;
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
