package com.java.array;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		
		int[] arr = {-3 , 6 ,12 ,34 ,8 ,54};
		
		System.out.println("Length of array :"+arr.length);
		
		
		Arrays.sort(arr);
		
		System.out.println("Asscending :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.println("Decending :");

		for (int i = 5; i>=0; i--) {
			System.out.print(" "+arr[i]);
		}
		
		
	}

}
