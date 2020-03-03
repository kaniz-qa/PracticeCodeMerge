
//3. Write a Java program to divide two numbers and print on the screen.

package com.java.online.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Excersize3 {

	public static void main(String[] args) {
		
		System.out.println(45/2);
		
		double a=65;
		int b=2;
		double c= a/b;
		
		System.out.println(c);
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter num1: ");
		double s=input.nextDouble();
		System.out.print("enter num2: ");
		int d=input.nextInt();		
		
		double result = s/d;
		System.out.println(result);
		System.out.printf("%.3f",result);
		System.out.println();
		System.out.println(String.format("%.3f",result));
		
		DecimalFormat df= new DecimalFormat("00.00");
		System.out.println(df.format(result));
		
		
		
	}

}
