package com.java.practice;

public class MyHalfRightTrainglePattern {

	public static void main(String[] args) {
		

		for(int row=1; row<=4; row++) { 
			
			for(int col=1; col<=row; col++) {	
				//char d = (char) (col +96); 
				System.out.print(" "+row);
				
			}
			System.out.println();
		}
						
		for(int row=5; row>=1; row--) { 
			
			for(int col=1; col<=row; col++) {	
				//char d = (char) (col +96); 
				System.out.print(" "+row);
				
			}
			System.out.println();
		}

		
		System.out.println();
		System.out.println();
		

		for(int row=1; row<=4; row++) { 
			
			for(int col=1; col<=row; col++) {	
				char d = (char) (col +96); 
				System.out.print(" "+d);
				
			}
			System.out.println();
		}
						
		for(int row=5; row>=1; row--) { 
			
			for(int col=1; col<=row; col++) {	
				char d = (char) (col +96); 
				System.out.print(" "+d);
				
			}
			System.out.println();
		}

		
		
		
		System.out.println();
		System.out.println();
		

		for(int row=1; row<=4; row++) { 
			
			for(int col=1; col<=row; col++) {	
				char d = (char) (col +64); 
				System.out.print(" "+d);
				
			}
			System.out.println();
		}
						
		for(int row=5; row>=1; row--) { 
			
			for(int col=1; col<=row; col++) {	
				char d = (char) (col +64); 
				System.out.print(" "+d);
				
			}
			System.out.println();
		}

		

		System.out.println();
		System.out.println();
		

		for(int row=1; row<=4; row++) { 
			
			for(int col=1; col<=row; col++) {	
				//char d = (char) (col +64); 
				System.out.print(" *");
				
			}
			System.out.println();
		}
						
		for(int row=5; row>=1; row--) { 
			
			for(int col=1; col<=row; col++) {	
				//char d = (char) (col +64); 
				System.out.print(" *");
				
			}
			System.out.println();
		}

		
		
		
	}

}
