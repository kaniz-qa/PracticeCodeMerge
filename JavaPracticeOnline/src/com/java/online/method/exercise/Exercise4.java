
//4. Write a Java method to count all vowels in a string.


package com.java.online.method.exercise;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s1 = input.nextLine();
		
		System.out.println(vowels( s1));
	}
	

	 public static int vowels(String s1)
	    {
	        int count = 0;
	        for (int i = 0; i < s1.length(); i++)
	        {
	            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i'
	                    || s1.charAt(i) == 'o' || s1.charAt(i) == 'u')
	            {
	                count++;
	            }
	        }
	        return count;
		
	}
	
}
