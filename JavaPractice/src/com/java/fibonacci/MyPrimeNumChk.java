package com.java.fibonacci;

public class MyPrimeNumChk {

	public static void main(String[] args) {

		int w=13;
		int count=0;
		for (int i = 2; i < w; i++) {
			if(w%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Prime");
		count=0;
		
		}else
		{
			System.out.println("Not prime");
		}
		// prime number from 1 to 50
		
		System.out.println("Prime number from 1 to 50 :");
		
		int count1=0;
		for (int b = 1; b <=60; b++) {
			for (int g = 2; g < b-1; g++) {
				if(b%g==0) {
					count1++;
					break;
				}
			
				
			}
			if(count1==0) 
				System.out.print(b+" ");
				count1=0;
			
		}
		
	}

}
