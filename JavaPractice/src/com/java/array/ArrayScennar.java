package com.java.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayScennar {

	public static void main(String[] args) {
		/*
		Scanner sc =new Scanner(System.in);
		
		int[] arr = new int[5];
		System.out.print("Enter 5 numbers :");
					
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			
		}
		
		System.out.println(sum);
	//int avg = sum / arr.length ;
		System.out.println(sum / arr.length);
	
	*/
	
	String[] name = { "yellin" , "samin" , "aryan" , "zafir" , "rabeya" } ;
	
	for(String x : name) {
		System.out.println(x);
	}
	
	System.out.println("String Array assending :");
	Arrays.sort(name);
	System.out.println(Arrays.toString(name));
	
	Arrays.sort(name, Collections.reverseOrder());
	System.out.println("String Array decending :");
	System.out.println(Arrays.toString(name));

	
	
	
	
	
	
	
	
	
}
	
	

}
