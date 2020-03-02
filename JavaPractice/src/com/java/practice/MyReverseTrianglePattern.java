package com.java.practice;

public class MyReverseTrianglePattern {

	public static void main(String[] args) {
		
		System.out.println();
		for (int row = 4; row >= 1; row--) {
			for (int col = 1; col <= 5-row; col++) {
				System.out.print("   ");
				
			}
			for (int col = 1; col <= 2*row-1; col++) {
				System.out.print("*  ");
			}
			System.out.println();
		}


	}

}
