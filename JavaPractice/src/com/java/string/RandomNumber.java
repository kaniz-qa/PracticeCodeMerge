package com.java.string;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int randNum = rand.nextInt(10);
		System.out.println(randNum + " ");
		
		
		int random = (int)(Math.random()*10) ;
		System.out.println(random);

		
		
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
