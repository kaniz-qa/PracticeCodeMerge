
//4. Write a Java program to calculate the average value of array elements.


package com.java.online.array;

import java.text.DecimalFormat;

public class AvgArray {

	public static void main(String[] args) {
		
		int[] array = {10,10,20,30,20,40};
		
		double sum = 0;
		
		for (int i = 0; i <array.length; i++) {
			sum=sum+array[i];
			
		}
		System.out.println(sum);
		//double avg = (sum)/array.length;
		double avg = (sum)/6;
		System.out.println("Average of array :"+ avg);
		
		DecimalFormat df = new DecimalFormat("00.00");
		System.out.println(df.format(avg)); 
		

	}

}
