package com.kn.anagramstring;

import java.util.Scanner;

public class AnagramStringDemo {

	public static void main(String[] args) {
		//Take the input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two string: ");
		String s1 = scan.nextLine() ;
		String s2 = scan.nextLine();
				
		//Create an object
		AnagramString aString = new AnagramString();
		
		//Call the method
		boolean output = aString.isAnagramString(s1,s2);
		
		//Print the resultant
		System.out.println("The anagram is: "+output);
		
		//Release resources
		scan.close();
	}

}
