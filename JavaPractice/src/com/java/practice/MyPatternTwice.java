package com.java.practice;

public class MyPatternTwice {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row*col+" ");
			}
			System.out.println();
		}

	}

}
