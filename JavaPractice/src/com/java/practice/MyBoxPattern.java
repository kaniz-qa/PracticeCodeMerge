package com.java.practice;

public class MyBoxPattern {

	public static void main(String[] args) {
	
		
		
		//Another pattern which looks like a box
		
		System.out.println("Another pattern which looks like a box: ");
		System.out.println();
		
		
		for(int i=1;i<=4;i++) { //  first row then enter into inner loop continue ...; up to last row 4
			
			for(int j=1;j<=4;j++) {		 // for one row		
				
				if(i==1||i==4||j==1||j==4) 
				System.out.print("  *");
				else 
					System.out.print("   ");
				
			}
			System.out.println();
		}

	}

}
