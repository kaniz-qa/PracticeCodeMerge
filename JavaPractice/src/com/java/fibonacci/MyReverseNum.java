package com.java.fibonacci;

public class MyReverseNum {

	public static void main(String[] args) {
		int i,sum,temp,r;
		i=456;
		temp=i;
		sum=0;
		
		while(temp!=0) {
			r=temp%10;
			temp=temp/10;
			sum=sum*10+r;
		}
		System.out.println("Reverse number is : " + sum);

	}

}
