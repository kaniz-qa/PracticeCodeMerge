//14. Write a Java program to print an American flag on the screen.

package com.java.online.practice;

public class Excercise14 {

	public static void main(String[] args) {
		String a="* * * * * * =======================================\n * * * * *  =======================================";
	
		String c="===================================================";
		
		for (int i = 0; i <4; i++) {
			System.out.println(a);
		}

		System.out.println(a);
		for (int i = 0; i <6; i++) {
			System.out.println(c);
		}
	}

}
