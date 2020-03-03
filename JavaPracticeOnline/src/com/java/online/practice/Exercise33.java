
/*
 * 	33. Write a Java program and compute the sum of the digits of an integer. 
			Input Data:
			Input an integer: 25
			Expected Output	(2+5)	The sum of the digits is: 7
			
 * 
 */


package com.java.online.practice;

import java.util.Scanner;

public class Exercise33 {

	public static void main(String[] args) {
		
		int temp,r,sum=0;
		
		Scanner input=new Scanner(System.in);
		System.out.print("enter  num: ");
		int x=input.nextInt();
		
		/*
		 * System.out.print("enter second num: "); int y=input.nextInt();
		 * 
		 * int a=x+y; if(a==7) { System.out.println("The sum of the digits is: "+a); }
		 * else { System.out.println("input another number."); }
		 */

		temp=x;
		while(temp!=0) {
			r=temp%10;
			temp=temp/10;
			sum=sum+r;
		}
		
		if(temp==0) {
			System.out.println(sum);
		}
		
		
		
	}

}
