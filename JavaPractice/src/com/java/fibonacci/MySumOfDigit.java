package com.java.fibonacci;

public class MySumOfDigit {

	public static void main(String[] args) {
		int i,temp,r,sum;
		sum=0;
		i=234;
		temp=i;
		
		while(temp!=0) {
			r=temp%10;
			sum=sum+r;
			temp=temp/10;
		}
		System.out.println("Sum of digit :" + sum);

	}

}
