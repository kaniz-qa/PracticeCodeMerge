
//1. Write a Java program to sort a numeric array and a string array.


package com.java.online.array;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int[] array= {1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
		
		//System.out.println(Arrays.toString(array));
		//System.out.print(Arrays.sort(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}

}
