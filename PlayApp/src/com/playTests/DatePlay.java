package com.playTests;

import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;

public class DatePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		datePlay1();

	}
	
	public static void datePlay1() {
		
		YearMonth now = YearMonth.now();
		System.out.println("Year Month Now is: " + now);
		
		YearMonth birthday = YearMonth.of(1975, 6);
		birthday.getMonth();
		birthday.getYear();
		LocalDate bDay = birthday.atDay(5);
		System.out.println("BirthDate: " + bDay);
		
		LocalDate endOfMonth = now.atEndOfMonth();
		
		System.out.println("End Of Month: " + endOfMonth);
		
		Instant timestamp = Instant.now();
		//timestamp.
		System.out.println("Timestamp as of now is: " + timestamp);
	}

}
