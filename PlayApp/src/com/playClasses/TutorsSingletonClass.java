package com.playClasses;

import java.util.ArrayList;
import java.util.List;

public class TutorsSingletonClass {

	private static TutorsSingletonClass tutorSingleton = null;
	public List<TutorClass> tutors = null;
	
	private TutorsSingletonClass() {
				
		tutors = new ArrayList<TutorClass>();
		
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
		
	}
	
	public static final TutorsSingletonClass getInstance() {
		if (tutorSingleton == null) {
			tutorSingleton = new TutorsSingletonClass();
		}
		
		return tutorSingleton;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TutorsSingletonClass tutorSingletonClass = TutorsSingletonClass.getInstance();
		List<TutorClass> tutorsList = tutorSingletonClass.tutors;
		
		System.out.println(tutorsList.toString());
		
		TutorsSingletonClass tutorSingletonClass2 = TutorsSingletonClass.getInstance();
		TutorClass tutor = tutorSingletonClass.tutors.get(0);
		System.out.println(tutor.toString());
		
		tutor.setWorkerId("XX");
		System.out.println(tutor.toString()); //able to update value from the hashmap - is this expected.
				
		

	}

}
