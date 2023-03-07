package com.playTests;

import java.util.Arrays;
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

}
