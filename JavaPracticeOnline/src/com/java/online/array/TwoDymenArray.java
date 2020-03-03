

//3. Write a Java program to print the following grid.


package com.java.online.array;

public class TwoDymenArray {

	public static void main(String[] args) {
		
		int[][] array = new int[10][10];
		
		for (int i = 1; i <10; i++) {
			for (int j = 1; j <10; j++) {
				char ch = (char)(i+64);
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		
		for (int i = 1; i <10; i++) {
			for (int j = 0; j <i; j++) {
				char ch = (char)(i+64);
				System.out.print(ch + " ");
			}
			System.out.println();
		}

		
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i <10; i++) {
			for (int j = 0; j <10; j++) {
				//char ch = (char)(i+64);
				System.out.print( " - ");
			}
			System.out.println();
		}

		
		
	}

}
