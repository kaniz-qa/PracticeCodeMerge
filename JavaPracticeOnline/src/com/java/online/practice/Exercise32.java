

/*
 * 32.Write a Java program to compare two numbers.
 * Expected Output

				25 != 39                                                                          
				25 < 39                                                                           
				25 <= 39
 */

package com.java.online.practice;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("enter first num: ");
		int x=input.nextInt();
		
		System.out.print("enter second num: ");
		int y=input.nextInt();
		
		if(x==y) {
			System.out.println(x+" == "+y);
		}
		if(x!=y) {
			System.out.println(x+" != "+y);
		}
		if(x>=y) {
			System.out.println(x+" >= "+y);
		}
		if(x<=y) {
			System.out.println(x+" <= "+y);
		}
		if(x>y) {
			System.out.println(x+" > "+y);
		}
		if(x<y) {
			System.out.println(x+" < "+y);
		}
		
	}

}
