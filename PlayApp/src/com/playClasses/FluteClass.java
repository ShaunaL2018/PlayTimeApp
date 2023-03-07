package com.playClasses;

public class FluteClass extends MusicAbstractClass {
	
	
	@Override
	public String musicSoundRange() {
		return ("High and Low Range");
	}

	@Override
	public Double musicInstrumentCost() {
		// TODO Auto-generated method stub
		return (70.00);
	}
	
	@Override
	public void setMusicGroup(String musicGroup){
		super.setMusicGroup(musicGroup);	
	}
	
	@Override
	public String getMusicGroup() {
		return super.getMusicGroup();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FluteClass flute = new FluteClass();
		boolean highRange = flute.highRange(true);
		boolean lowRange = flute.lowRange(true);
		flute.setMusicGroup("String");
		String musicGroup = flute.getMusicGroup();
		Double instrumentCost = flute.musicInstrumentCost();
		
		System.out.println("The flute is of the Music Group " + musicGroup);
		System.out.println("The flute costs " + instrumentCost);
		System.out.println("Is this low range " + lowRange);
		System.out.println("Is this high range " + highRange);
	
		
	}

}
