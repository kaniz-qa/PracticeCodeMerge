

//15. Write a Java program to swap two variables.

package com.java.online.practice;

public class Exercise15 {

	public static void main(String[] args) {
		int a=5;
		int b=8;
		int temp=0;
		
		System.out.println("a = "+a+ "\tb = "+b);
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a = "+a+ "\tb = "+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("a = "+a+ "\tb = "+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("a = "+a+ "\tb = "+b);
	}

}
