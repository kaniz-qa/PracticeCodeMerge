
//2. Write a Java program to sum values of an array.


package com.java.online.array;

public class ArraySum {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for (int i = 0; i <=array.length; i++) {
			sum += i;
			//System.out.println("Sum of Array :"+sum);
		}
		System.out.println("Sum of Array :"+sum);
	}

}
