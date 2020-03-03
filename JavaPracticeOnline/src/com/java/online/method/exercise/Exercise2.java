
//2. Write a Java method to compute the average of three numbers.



package com.java.online.method.exercise;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first num : ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second num : ");
		int num2 = input.nextInt();
		
		System.out.print("Enter third num : ");
		int num3 = input.nextInt();
		

		Exercise2 e1=new Exercise2();
		System.out.println(e1.average(num1, num2, num3));
		
	}

	
	int average(int num1,int num2,int num3) {
		int average=(num1+num2+num3)/3;
		return average;
	}
	
	
	
	
}
