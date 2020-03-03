

//5. Write a Java program to test if an array contains a specific value.

package com.java.online.array;

public class ArraySpecificValue {

	public static boolean contains(int[] arr, int item) {
	      for (int n : arr) {
	         if (item == n) {
	            return true;
	         }
	      }
	      return false;
	   }
	
	public static void main(String[] args) {
		
		/*
		 * int[] array = new int[] {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254,
		 * 1472, 2365, 1456, 2265, 1457, 2456}; int value = 1456; for (int i = 0; i
		 * <array.length; i++) { if(value==array[i]) {
		 * System.out.println("Array contains this value ."); } }
		 */
		int[] my_array1 = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2265, 1457, 2456};
	      System.out.println(contains(my_array1, 2013));
	      System.out.println(contains(my_array1, 2015));
		
		
	}

}
