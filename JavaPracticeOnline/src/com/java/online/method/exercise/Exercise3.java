/*
3. Write a Java method to display the middle character of a string. Go to the editor
Note: a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
*/

package com.java.online.method.exercise;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		

		Scanner input=new Scanner(System.in);
		System.out.print("Enter sring : ");
		String s1=input.nextLine();
		
		System.out.println(middle( s1));
		
	}

	static String middle(String s1) {
		 
		int position;
		int length=s1.length();
		if(length%2==0) {
			position=length/2-1;
			length = 2;
		}
		else {
			position=length/2;
			length = 1;
		}
		return s1.substring(position, position+length);
	}
	
	
}
