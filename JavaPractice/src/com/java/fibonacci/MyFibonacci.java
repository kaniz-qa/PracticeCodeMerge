package com.java.fibonacci;

public class MyFibonacci {

	public static void main(String[] args) {
		
		int first=0;
		int second=1;
		int fibo;
		System.out.print(first + " " + second + " ");
		
		for (int i = 3; i <=15; i++) {
			fibo=first+second;
			System.out.print(fibo+" ");
			first=second;
			second=fibo;
		}
		

	}

}
