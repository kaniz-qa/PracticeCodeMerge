package com.java.practice;

public class MyPattern {

	public static void main(String[] args) {
		
		// pattern one
		
		for(int i=1;i<=4;i++) { //  first row then enter into inner loop continue ...; up to last row 4
			
			for(int j=1;j<=4;j++) {		 // print how many in each row	
				
				
				int k=i+j-1;
				if(k>4)
					System.out.print(k-4+" ");
				else
				System.out.print(k+" ");
				//System.out.print(j+" ");
				//char d=(char)(j+64);
				//char d=(char)(j+96);
				//System.out.print(j+" ");
				
				//System.out.print(" *");
				
			}System.out.print(" ");
			
			System.out.println();
		}
	
		
		
		
		
	
		
		
		
	}

}
