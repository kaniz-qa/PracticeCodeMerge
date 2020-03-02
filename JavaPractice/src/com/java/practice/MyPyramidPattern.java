package com.java.practice;

public class MyPyramidPattern {

	public static void main(String[] args) {
		
		for (int row = 1; row <= 6; row++) {
			for (int col = 1; col <= 6-row; col++) {
				System.out.print("   ");
				
			}
			for (int col = 1; col <= 2*row-1; col++) {
				//System.out.print("*  ");
				//System.out.print("  "+ row);
				System.out.print("  "+ col);
				
				//char d= (char)(col+64);
				//char d= (char)(col+96);
				//System.out.print("  "+ d);
				
			}
			
			System.out.println();
		}
		
		
		
	}

}
