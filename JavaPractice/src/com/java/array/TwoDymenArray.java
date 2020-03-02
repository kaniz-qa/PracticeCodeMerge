package com.java.array;

import java.util.Scanner;

public class TwoDymenArray {

	public static void main(String[] args) {
		
		
		int[][] arr = new int[2][3];
		
		arr[0][0]= 20;
		arr[0][1]= 40;
		arr[0][2]= 30;
		arr[1][0]= 10;
		arr[1][1]= 70;
		arr[1][2]= 90;
		
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(" "+arr[row][col]);
			}
			System.out.println();
		}
		
		
		int[][] arr2 = new int[2][3];
		int[][] arr3 = new int[2][3];
		
		Scanner sc = new Scanner(System.in);
		
		// arr2 input
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {
				//System.out.printf("Arr2[%d][%d]:" , row ,col);
				arr2[row][col] = sc.nextInt();
			}
			
		}
		
		// arr2 print
		System.out.println("Array arr2 : ");
				for (int row = 0; row < 2; row++) {
					for (int col = 0; col < 3; col++) {
						System.out.print(" "+arr2[row][col]);
						
					}
					System.out.println();
				}
				
				
				
				
				
				
		// arr3 input
				for (int row = 0; row < 2; row++) {
					for (int col = 0; col < 3; col++) {
						//System.out.printf("Arr3[%d][%d]:" , row ,col);
						arr3[row][col] = sc.nextInt();
					}
				}
		
		
				// arr3 print
				System.out.println("Array arr3 : ");
				
				for (int row = 0; row < 2; row++) {
					for (int col = 0; col < 3; col++) {
						System.out.print(" "+arr3[row][col]);
					}
					System.out.println();
				}
		
				// Arr2 + Arr3
					System.out.println("Array arr3 + arr3 : ");
				
				for (int row = 0; row < 2; row++) {
					for (int col = 0; col < 3; col++) {
						System.out.print(" "+(arr2[row][col]+arr3[row][col]));
					}
					System.out.println();
				}
			
				
 
	}

}
