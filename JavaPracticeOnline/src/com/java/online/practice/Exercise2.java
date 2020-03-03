
//2. Write a Java program to print the sum of two numbers.

package com.java.online.practice;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		/*
		 * int a=34; int b=56; int result=a+b;
		 * System.out.println("addition 1: "+result); System.out.println(24+26);
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter num one: ");
		int sum1=input.nextInt();
		
		
		System.out.print("Enter num two: ");
		int sum2=input.nextInt();
		
		int result=sum1+sum2;
		
		System.out.println(result);

	}

}
