package com.playClasses;

public enum DayOfWeek {

	Sunday(1),
	Monday(2),
	Tuesday(3),
	Wednesday(4),
	Thursday(5),
	Friday(6),
	Saturday(7);
	
	final int correspondingNumber;
	
	private DayOfWeek(int correspondingNumber){
		
		this.correspondingNumber = correspondingNumber;
		
	}
	
	
	public static DayOfWeek valueOfDay(int correspondingNunber) {
	    for (DayOfWeek e : DayOfWeek.values()) {
	        if (e.correspondingNumber == correspondingNunber) {
	            return e;
	        }
	    }
	    return null;
	}
	
	public static int numberValueforDay(DayOfWeek day) {
		int i = 0;
	    for (DayOfWeek e : DayOfWeek.values()) {
	        if (e.name().equalsIgnoreCase(day.toString())) {
	            i = e.correspondingNumber;
	        }
	    }
	    return i;
	}
}
