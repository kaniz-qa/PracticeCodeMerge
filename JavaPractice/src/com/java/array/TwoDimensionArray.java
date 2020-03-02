package com.java.array;

public class TwoDimensionArray {

	public static void main(String[] args) {

		int[][] twoDimen = new int[4][3];

		twoDimen[0][0] = 3;
		twoDimen[0][1] = 2;
		twoDimen[0][2] = 6;

		twoDimen[1][0] = 1;
		twoDimen[1][1] = 9;
		twoDimen[1][2] = 4;

		twoDimen[2][0] = 3;
		twoDimen[2][1] = 7;
		twoDimen[2][2] = 2;

		twoDimen[3][0] = 3;
		twoDimen[3][1] = 6;
		twoDimen[3][2] = 2;

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(" " + twoDimen[row][col]);
			}
			System.out.println();
		}

		System.out.println();

		int[][] twoDimen2 = new int[4][3];

		twoDimen2[0][0] = 4;
		twoDimen2[0][1] = 2;
		twoDimen2[0][2] = 2;

		twoDimen2[1][0] = 4;
		twoDimen2[1][1] = 9;
		twoDimen2[1][2] = 4;

		twoDimen2[2][0] = 1;
		twoDimen2[2][1] = 5;
		twoDimen2[2][2] = 3;

		twoDimen2[3][0] = 5;
		twoDimen2[3][1] = 6;
		twoDimen2[3][2] = 2;

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(" " + twoDimen2[row][col]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 3; col++) {

			System.out.print("\t" + (twoDimen2[row][col] + twoDimen[row][col]));
				
			}
			System.out.println();
			System.out.println();
		}

	}

}
