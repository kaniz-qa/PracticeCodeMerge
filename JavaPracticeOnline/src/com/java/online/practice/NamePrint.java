

//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.


package com.java.online.practice;

import java.util.Scanner;

public class NamePrint {

	public static void main(String[] args) {
		/*
		 * String name="Kaniz Fatema"; System.out.println("Hello"+"\nKaniz Fatema");
		 * System.out.println(); System.out.println("Hello\n"+name);
		 * System.out.println(); System.out.println("Hello\nKaniz Fatema");
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first name: ");
		String fname=input.next();
		System.out.print("Enter last name: ");
		String lname=input.next();
		
		System.out.println("Hello\n"+fname+" "+lname);

	}

}
