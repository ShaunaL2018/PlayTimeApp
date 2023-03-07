package com.playTests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilePlay {

	public static void main(String[] args) {
		
		File myFile = new File("myFile.txt");
		
		try {
			if (!myFile.exists()) {
				myFile.createNewFile();
			} else {
				
				//add some text to the file
				
				FileWriter fWriter = new FileWriter(myFile);
				PrintWriter pWriter = new PrintWriter(fWriter);
				
				pWriter.println("Hello, it's me Shauna");
				pWriter.println("Having more.....fun!");
				
				pWriter.close();
								
				fWriter = new FileWriter(myFile, true);
				pWriter= new PrintWriter(fWriter);
				pWriter.println("Adding another fun filled Line");
				
				pWriter.close();
				
			}
			
			Scanner myScan = new Scanner(myFile);
			StringBuilder builder = new StringBuilder();
			
			while (myScan.hasNextLine()) {
				String line = myScan.nextLine();
				builder = builder.append(line);			
				
			}
			
			if (builder.length() > 0) {
				System.out.println("Builder has a character total of: " + builder.length());
			}
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}		
		
	}

}
