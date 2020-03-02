package com.java.array;

public class PracticeArray {

	public static void main(String[] args) {

		double[] num = new double[10];
		num[0] = 23;
		num[1] = 27;
		num[2] = 1223;
		num[3] = 56;
		num[4] = 7;
		num[5] = 90;
		num[6] = 34;
		num[7] = 8;

		double sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}

		double max=num[0];
		double min=num[0];
		for (int i = 0; i < num.length; i++) {
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
		
		
		
		System.out.println("Sum : " + sum);
		System.out.println("Avg : " + sum / num.length);
		System.out.println("Min : " + min);
		System.out.println("Max : " + max);

		System.out.println(num[2]);
		System.out.println(num.length);

	}

}
