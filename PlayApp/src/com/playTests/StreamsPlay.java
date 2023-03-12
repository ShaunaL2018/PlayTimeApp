package com.playTests;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPlay {

	public static void main(String[] args) {
		
		//StreamsTest1();
		StreamsTest2();
	}
	
	public static void StreamsTest1(){
		
		List<Integer> numbers = Arrays.asList(1, 2, 3);
		Long count = numbers.stream().count();
		System.out.println("count of list: " + count);
		
		numbers.stream().forEach(e -> System.out.println(e));
		
	}
	
	public static void StreamsTest2() {
		
		Stream<Integer> createdStream = Stream.of(1, 2, 3, 1, 1, 1, 2, 4);
		//Long count = createdStream.count();
		//System.out.println("total count of numbers:" + count);
		
		List<Integer> listOfNumbers = createdStream.sorted().collect(Collectors.toList());
		System.out.println("Sorted numbers:" + listOfNumbers);
	}
	
	public int StreamsTest3(int[] statues) {

		int minimumNoOfStatuesNeeded = 0;

		//note:all statues positive integer

		//arranged from smallest to largest
		List<Integer> statuesList = Arrays.stream(statues).boxed().collect(Collectors.toList());
		statuesList.sort(Comparator.naturalOrder());

		for (int i = 0; i < statuesList.size()-1; i++) {
		    
		   int numberOne =  statuesList.get(i);
		   int numberTwo =  statuesList.get(i+1);
		   
		   int difference = numberTwo - numberOne;
		   
		   if (difference > 1){    
		     int add = difference-1;
		     minimumNoOfStatuesNeeded = minimumNoOfStatuesNeeded + add;
		   }
		   
		}

		return minimumNoOfStatuesNeeded;
		}

	
	static int solution(int n) {
	    
	    int x = 1;
	    int numberbuilder = 0;
	    StringBuilder builder = new StringBuilder();
	    
	    while (x < n+1){
	        
	        builder = builder.append(9);           
	        x++;
	    }
	    
	    numberbuilder = Integer.parseInt(builder.toString());
	    
	    return numberbuilder;

	}


}
