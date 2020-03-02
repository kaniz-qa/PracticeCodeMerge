package com.java.practice;

public class MyPattern3 {

	public static void main(String[] args) {
		System.out.println("Another pattern which column depend on row .");
		
		//that means first row print one *,second row print 2 *, third row print 3 * like this...
		System.out.println();
		
		System.out.println("Looks traingle: ");
		System.out.println();
		for(int i=1;i<=4;i++) { //  first row then enter into inner loop continue ...; up to last row 4
			
			for(int j=1;j<=i;j++) {		 // for one row					
				System.out.print(i +" ");// print the value of row
				
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		for(int i=1;i<=4;i++) { //  first row then enter into inner loop continue ...; up to last row 4
			
			for(int j=1;j<=i;j++) {		 // for one row					
				System.out.print(j +" ");// print the value of col
				
			}
			System.out.println();
		}

		
		
		
		

		
		

	}

}
