package com.playTests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import com.playClasses.TutorClass;
import com.playClasses.TutorsSingletonClass;

public class CachingPlay {

	public static void main(String[] args) {
		hashMapCaching1();
		hashMapCaching2();
		
	}
	
	public static void hashMapCaching1() {
		
		List<TutorClass> tutors = new ArrayList<TutorClass>();
		
		TutorClass tutor = new TutorClass();
		tutor.setWorkerFirstName("Mable");
		tutor.setWorkerLastName("Bayer");
		tutor.setWorkerShift("Part-time");
		tutor.setWorkerType("Math Tutor");
		tutor.setWorkPayRate(12.00);
		tutor.setWorkerId("T1");
		tutors.add(tutor);
		
		TutorClass tutor2 = new TutorClass();
		tutor2.setWorkerFirstName("Cara");
		tutor2.setWorkerLastName("Wills");
		tutor2.setWorkerShift("Part-time");
		tutor2.setWorkerType("Reading Tutor");
		tutor2.setWorkPayRate(11.00);
		tutor2.setWorkerId("T2");
		tutors.add(tutor2);
		
		if (tutors.size() > 0) {
			tutors.stream().filter(e -> e.getWorkerShift().equalsIgnoreCase("Part-time")).
			forEach(System.out::println);
			
			tutors.stream().forEach(System.out::println);
			
			long totalTutors = tutors.stream().count();
			System.out.println("total Tutor Count: " + totalTutors);
						
		}
		
		HashMap<String, TutorClass> tutorsMap = new HashMap<>();
		
		for (TutorClass tutorClass : tutors) {
			
			tutorsMap.put(tutorClass.getWorkerId(), tutorClass);
			
		}
		
		tutorsMap.keySet().stream().forEach(System.out::println);
				
	}
	
	public static void hashMapCaching2() {
		
		TutorsSingletonClass tutorSingletonClass = TutorsSingletonClass.getInstance();
		List<TutorClass> tutorsList = tutorSingletonClass.tutors;
		
		System.out.println(tutorsList.toString());
		
		TutorsSingletonClass tutorSingletonClass2 = TutorsSingletonClass.getInstance();
		TutorClass tutor = tutorSingletonClass2.tutors.get(0);
		System.out.println(tutor.toString());
		
		tutor.setWorkerId("123");
		System.out.println(tutor.toString()); //able to update value from the hashmap - is this expected.
				
	
		
	}

}
