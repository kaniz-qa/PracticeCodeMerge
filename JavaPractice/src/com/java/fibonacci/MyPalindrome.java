package com.java.fibonacci;

import java.util.Scanner;

public class MyPalindrome {

	public static void main(String[] args) {
		//Scanner n=new Scanner(System.in);
		//i=n.nextInt();
		
		int i=646;
		int temp=i;
		int sum=0;
		int r;
		
		while(temp!=0) {
			r=temp%10;
			sum=sum*10+r;
			temp=temp/10;
		}
		//System.out.println("Sum of digit : " + sum);
		
		
		if(sum==i) {
			System.out.println("This is palindrome number .");
		}
		else {
			System.out.println(" Not a palindrome number .");
		}
		
		

	}

}
