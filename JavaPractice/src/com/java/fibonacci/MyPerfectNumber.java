/*	Perfect number is a positive integer 
	that is equal to the sum of its positive
	 Deviser excluding the number itself.
	num=28 , positive diviser = 1,2,4,7,14
	1+2+4+7+14=28 which is perfect number
*/


package com.java.fibonacci;

import java.util.Scanner;

public class MyPerfectNumber {

	public static void main(String[] args) {
		int i, Number, Sum = 0 ;
		//Scanner sc = new Scanner(System.in);		
		//System.out.println("\n Please Enter any Number: ");
		//Number = sc.nextInt();

		Number = 28;
		for(i = 1 ; i < Number ; i++) { //for(i = 1 ; i <=Number/2 ; i++)--->it will works also
			if(Number % i == 0)  {
				Sum = Sum + i;
				//Sum+=i;
				System.out.print(i+" ");
				
				
			}
		}
		System.out.println("="+Sum);
		if (Sum == Number) {
			System.out.format("\n% d is a Perfect Number", Number);
		}
		else {
			System.out.format("\n% d is NOT a Perfect Number", Number);
		}

	}

}
