package com.java.practice;

public class MyPattern2 {

	public static void main(String[] args) {
		
		
		System.out.println("Another pattern which column depend on row .");
		//that means first row print one *,second row print 2 *, third row print 3 * like this...
		System.out.println();
		
		for(int row=1;row<=4;row++) { //  first row then enter into inner loop continue ...; up to last row 4
			
			for(int col=1;col<=4;col++) {		 // for one row					
				System.out.print(" "+ col ) ;
				
				
			}
			
			System.out.println();
			
		}

	}

}
