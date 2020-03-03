
//8. Write a Java program to copy an array by iterating the array.

package com.java.online.array;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170};
		
		//int[] arraySrc = new int[17];
		//int[] arraySrc = new int[n];
		int[] arraySrc = new int[array.length];
		
		System.out.println("Array before : " + Arrays.toString(array));
		
		for (int i = 0; i < array.length; i++) {
			
			arraySrc[i]=array[i] ;
			
		}
		System.out.println("Copy of Array : "+ Arrays.toString(arraySrc));

	}

}
