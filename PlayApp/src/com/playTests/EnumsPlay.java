package com.playTests;

import com.playClasses.DayOfWeek;

public class EnumsPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstDay = DayOfWeek.Sunday.toString();
		System.out.println("First Day of the Week is: " + firstDay);
		
		DayOfWeek[] days = DayOfWeek.values();
		for (DayOfWeek dayOfWeek : days) {
			String dayofWeek = dayOfWeek.toString();
			System.out.println("Day of the Week is: " + dayofWeek);	
		}
		//get day corresponding to 2;
		String day = DayOfWeek.valueOfDay(2).toString();
		System.out.println("Day of week for " + "2: " + day);
		
		//get # corresponding to Day;
		int CorrespondingNumber = DayOfWeek.numberValueforDay(DayOfWeek.Saturday);
		System.out.println("Day of week for Saturday: " + CorrespondingNumber);
	
	}

}
