
//1. Write a Java method to find the smallest number among three numbers.


package com.java.online.method.exercise;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first num : ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second num : ");
		int num2 = input.nextInt();
		
		System.out.print("Enter third num : ");
		int num3 = input.nextInt();

		System.out.println(minNum( num1, num2, num3));
		
	}

	static int minNum(int num1,int num2,int num3) {
		
		return Math.min(Math.min(num1, num2),num3);
		
	}
	
	
}
