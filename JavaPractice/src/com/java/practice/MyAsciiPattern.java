package com.java.practice;

public class MyAsciiPattern {

	public static void main(String[] args) {
		
		/*int c= 65;
		char d = (char) c; 
		System.out.println(d);
		
		System.out.println();*/
		for(int row=1;row<=4;row++) { //  first row then enter into inner loop continue ...; up to last row 4
			
			for(int col=1;col<=row;col++) {		 // for one row	
				
				char d = (char) (col+64); 
				System.out.print(d +" ");// print the value of row
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int row=1;row<=4;row++) { //  first row then enter into inner loop continue ...; up to last row 4
			
			for(int col=1;col<=row;col++) {		 // for one row	
				
				char d = (char) (row +96); 
				System.out.print(d +" ");// print the value of row
				
			}
			System.out.println();
		}

	}

}
