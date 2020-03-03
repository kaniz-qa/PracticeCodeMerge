
//9. Write a Java program to insert an element (specific position) into an array.


package com.java.online.array;

import java.util.Arrays;

public class InsertArray {

	private static int[] insert(int[] a, int key, int index) {
		int[] result = new int[a.length + 1];

		for (int i = 0, j = 0; i < a.length; i++, j++) {
			if (i == index) {
				result[j] = key;
				j++;
			}
			result[j] = a[i];
		}

		return result;
	}
	public static void main(String[] args) {
		

		int[] a = { 1, 2, 4, 5 }; //int[] a
		System.out.println("Without insert array : "+ Arrays.toString(a));
		int key = 3;// which value want to insert
		int index = 2; // which position

		a = insert(a, key, index);
		System.out.println("With insert array : "+Arrays.toString(a));
	}

}
