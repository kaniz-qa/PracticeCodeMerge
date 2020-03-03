
//5. Write a Java method to count all words in a string. 


package com.java.online.method.exercise;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s1 = input.nextLine();
		
		System.out.println(countWords( s1));

	}

	public static int countWords(String s1) {
	    
	    String[] words = s1.split(" ");
	    return words.length;
	  }
}
