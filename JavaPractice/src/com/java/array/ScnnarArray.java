package com.java.array;

import java.util.Scanner;

public class ScnnarArray {

	public static void main(String[] args) {
		
		int[] myArray = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int f =0; f<5;f++){
			System.out.print("enter your number: ");
			myArray[f] = sc.nextInt();
		}
		sc.close();
		
		/*
		 * for(int i=0;i<myArray.length;i++){ System.out.println(myArray[i]); }
		 */

		for (int i = 0; i < myArray.length; i++) {
			boolean duplicate = false;
	        int j = 0;

	        while (j < i){

	            if ((i != j) && myArray[i] == myArray[j]) {
	                duplicate = true;
	                
	                break;
	            }
	            
	        }
	        System.out.print( myArray[j]+" duplicate ");
		}
			        
	}

}
