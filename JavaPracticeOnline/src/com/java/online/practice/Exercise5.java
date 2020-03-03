
//5. Write a Java program that takes two numbers as input and display the product of two numbers.


package com.java.online.practice;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		int a=25;
		int b=5;
		int c=a*b;
		System.out.println(c);
		
		System.out.println("way 2:  ");
		
		System.out.println(25*5);
		
		System.out.println("way 3:  ");
		
		Scanner input=new Scanner(System.in);
		System.out.print("enter num 1:  ");
		int s=input.nextInt();
		
		System.out.print("enter num 2:  ");
		int s1=input.nextInt();
		
		int d=s*s1;
		//System.out.println(d);
		
		System.out.print(s+" * "+s1+"="+s*s1);

	}

}
