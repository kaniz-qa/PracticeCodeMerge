
//37. Write a Java program to reverse a string.

package com.java.online.practice;

import java.util.Scanner;

public class Exercise37 {

	public static void main(String[] args) {
		
		String abc="The quick brown fox";

		/*
		 * StringBuilder input=new StringBuilder(); input.append(abc);
		 * input=input.reverse(); System.out.println(input);
		 */
		
		char[] input=abc.toCharArray();
		for (int i = input.length-1; i >=0 ; i--) {
			System.out.print(input[i]);
		}
		
		System.out.println();
		
		Scanner a=new Scanner(System.in);
		System.out.println("enter text :");
		char[] w=a.nextLine().toCharArray();
		for (int i = w.length-1; i >=0 ; i--) {
			System.out.print(w[i]);
		}
	
	}

}
