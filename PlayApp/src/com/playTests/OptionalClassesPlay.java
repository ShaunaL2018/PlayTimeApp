package com.playTests;

import java.util.Optional;

public class OptionalClassesPlay {

	public static void main(String[] args) {
		optionalClassTest1();
		
	}
	
	public static void optionalClassTest1() {
		
		String book = null;
		
		Optional<String> optionalString = Optional.ofNullable(book);
		
		if (optionalString.isPresent()) {
			System.out.println(optionalString);
		}
		if (optionalString.isEmpty()) {
			System.out.println("No Values here");
		}
		optionalString.orElse("Mary Poppins");
		System.out.println(optionalString);
		
		book = "Cinderella";
		optionalString = Optional.ofNullable(book);
		//optionalString.orElse("Mary Poppins"); - not working will need to revisit
		
		if (optionalString.isPresent()) {
			System.out.println(optionalString);
		}
		
		
		
		
		
	}

}
