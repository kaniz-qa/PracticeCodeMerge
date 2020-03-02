package com.java.practice;

public class MyPatternBinary {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) { //  first row then enter into inner loop continue ...; up to last row 4
			
			for(int j=1;j<=i;j++) {		 // for one row					
				System.out.print(i%2 +" ");// print the value of row
				
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		for(int i=1;i<=4;i++) { //  first row then enter into inner loop continue ...; up to last row 4
			
			for(int j=1;j<=i;j++) {		 // for one row					
				System.out.print(j%2 +" ");// print the value of col
				
			}
			System.out.println();
		}

		
		

	}

}
