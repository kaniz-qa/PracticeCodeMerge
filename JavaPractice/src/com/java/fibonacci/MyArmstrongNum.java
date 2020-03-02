
/*
 * num=153 ---> 1	5	3
 * 				1*1*1	5*5*5	3*3*3*
 * 				1+125+27 = 153 which is armstrong number
 * 
 */

package com.java.fibonacci;

public class MyArmstrongNum {

	public static void main(String[] args) {


		int i,temp,r,sum=0;
		i=1532;
		temp=i;
		
		while(temp!=0) {
			r=temp%10;
			temp=temp/10;
			sum=sum+r*r*r;
		}

		if(sum==i) 
		System.out.println("The number is armstrong.");
		else
			System.out.println("It's not.");
		
	}

}
