package com.java.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		
		
		int[] arr1 = new int[2];
		arr1[0] = 2;
		arr1[1] = 4;
		int[] arr2 = {3,5,8,10,34,27,80};
		System.out.println("Result: "+Arrays.toString(arr2));
		
		Arrays.sort(arr2);
		System.out.println("\n\n");
		System.out.print("Array assending :");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(" "+arr2[i]);
		}
		
		System.out.println("\n\n");
		System.out.print("Array desending :");
		for (int i = 6; i >= 0; i--) {
			System.out.print(" "+arr2[i]);
		}
		
		
		System.out.println("Result after sorting : "+Arrays.toString(arr2));
		
		
		int max = arr2[0];
		for (int i = 0; i < arr2.length; i++) {
			if(max<arr2[i]) {
				max = arr2[i];
			}
		}
		
		System.out.println("max array num :"+ max);
		
		
		
		int min = arr2[0];
		for (int i = 0; i < arr2.length; i++) {
			if(min>arr2[i]) {
				min = arr2[0];
			}
		}
		
		System.out.println("min array num :"+ min);
		
		
		
		
		
		
		
		
		System.out.println(" Array2 Binary Search :"+Arrays.binarySearch(arr2, 10));
		
		
		int[] arr5 = Arrays.copyOf(arr2, 4);
		System.out.println("Array5 is copy of array2 : "+ Arrays.toString(arr5));
		
		
		
		String[] seasons = new String[] {"Winter", "Spring", "Summer", "Autumn"};
		Arrays.sort(seasons);
		System.out.println("Seasons Array :"+Arrays.toString(seasons));
		
		String[] seasons2 = Arrays.copyOfRange(seasons, 1, 3);
		System.out.println("Seasons2 Array copy of seasons :"+Arrays.toString(seasons2));
		
		
		
		int[] arr4 = new int[] {2,5,7};
		
		int sum = 0;
		for(int i = 0; i< arr1.length;i++ ) {
			sum =  sum + arr1[i];
		}

		System.out.println(sum);
		int sum2 = 0;
		for(int i = 0; i< arr2.length;i++ ) {
			sum2 =  sum2 + arr2[i];
		}
		System.out.println(sum2);
		System.out.println(sum+sum2);
		
		for(int i = 0; i< seasons.length;i++ ) {
			System.out.println(seasons[i]);
		}
		
		
		
		
		String[] seasons3 = new String[] {"Winter", "Spring", "Summer", "Autumn"};
		Arrays.sort(seasons3);
		
		System.out.println(Arrays.toString(seasons));
		System.out.println(Arrays.toString(seasons3));
		
		System.out.println(seasons3.equals(seasons));
		System.out.println(Arrays.equals(seasons3, seasons));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
