
		/*
			6. Write a Java program to print the sum (addition),
			multiply, subtract, divide and remainder of two numbers
		*/



package com.java.online.practice;

import java.util.Scanner;

public class Excersice {

	public static void main(String[] args) {
		

		Scanner input=new Scanner(System.in);
		System.out.print("enter num 1:  ");
		int num1=input.nextInt();
		
		System.out.print("enter num 2:  ");
		int num2=input.nextInt();
		
		int a=num1+num2;
		int b= num1-num2;
		int c=num1*num2;
		int d=num1/num2;
		int e=num1%num2;
		
		/*System.out.println("addition : "+a+"\n"+"subtraction : "+b+
				"\n"+"multiplication : "+c+"\n"+"division : "+d+"\n"+"modulus: "+e);*/
		
		System.out.println(num1+" + "+num2+"="+a +"\n");
		System.out.println(num1+" - "+num2+"="+b+"\n");
		System.out.println(num1+" * "+num2+"="+c+"\n");
		System.out.println(num1+" / "+num2+"="+d+"\n");
		System.out.println(num1+" % "+num2+"="+e+"\n");
	}

}
