package com.playTests;

import java.math.BigDecimal;

public class ExamplesTest {

	public static void main(String[] args) {
		
		
	}
	
	long solution(int[] a) {

		long solution = Long.valueOf(0);

		//get size of array - for example 2
		int arraysize = a.length;

		//get elements to concat and store - for example 4
		//int adjustedArray = arraysize * arraysize;

		//ex array of size 4 will allow 0 to 3 indexes

		//List<Integer> sumValue = new ArrayList<Integer>();
		String[] values = new String[arraysize * arraysize];
		int vACounter = 0;

		//List<Integer> concatNumber = new ArrayList<Integer>();
		for (int i=0; i < a.length; i++){
		    
		    values[vACounter] = String.valueOf(a[i]) + String.valueOf(a[i]);
		    vACounter++;
		    
		    if (a.length > 1){
		        for (int j=1; j < a.length; j++){        
		            values[vACounter] = String.valueOf(a[i])+ String.valueOf(a[j-1]);
		            vACounter++;     
		        }   
		    }
		        
		}  

		//List<Integer> integerSums = Arrays.stream(values).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

		//add all elements for the total
		long totalSum = 0;
		for (String value : values) {
		    if (value !=null){
		        totalSum = totalSum + Long.valueOf(value);
		    }   
		}

		solution = totalSum;

		return solution;

		}
	
	   int solutionYear(int year) {
	
		   
		   BigDecimal yearBG = new BigDecimal(year);
		   BigDecimal[] yearBGrem = yearBG.divideAndRemainder(new BigDecimal(100));
		   int century = 0;
		   
		   if (yearBGrem.length == 1){
		       
		       century = Integer.valueOf(yearBGrem[0].toString());
		    
		   } else if (yearBGrem.length == 2){
		       
		       BigDecimal yearBGIndex = yearBGrem[0];
		       int convertedYear = Integer.valueOf(yearBGIndex.toString());
		        
		        century  = convertedYear + 1;
		    
		   }
		   
		   return century;
	   }
		   
	   int solution(int year) {

	    boolean remainderFound = false;
	    int century = 0;

	    if (year % 100 > 0){
	        remainderFound = true;
	    }

	    int quotient = year / 100;

	    if (remainderFound){
	        century = quotient + 1;
	    } else{
	        century = quotient;
	    }

	    return century;
	    
	}


}
