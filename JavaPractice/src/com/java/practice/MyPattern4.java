package com.java.practice;

public class MyPattern4 {

	public static void main(String[] args) {

		System.out.println("Reverse triangle : ");
		
		System.out.println();
		
		for(int row=4; row>=1; row--) { 
			
			for(int col=1; col<=row; col++) {					
				System.out.print(" "+col);
				
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		
		for(int row=4; row>=1; row--) { 
			
			for(int col=1; col<=row; col++) {					
				System.out.print(" "+row);
				
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
		
		
		for(int row=4; row>=1; row--) { 
			
			for(int col=1; col<=row; col++) {	
				char d = (char) (row +96); 
				System.out.print(" "+d);
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int row=4; row>=1; row--) { 
			
			for(int col=1; col<=row; col++) {	
				char d = (char) (col +96); 
				System.out.print(" "+d);
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int row=4; row>=1; row--) { 
			
			for(int col=1; col<=row; col++) {	
				//char d = (char) (col +96); 
				System.out.print(" "+col%2);
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int row=7; row>=1; row--) { 
			
			for(int col=1; col<=row; col++) {	
				//char d = (char) (col +96); 
				System.out.print(" "+row%2);
				
			}
			System.out.println();
		}
	}
	
	

}
