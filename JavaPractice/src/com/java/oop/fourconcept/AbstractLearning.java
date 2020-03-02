package com.java.oop.fourconcept;

public class AbstractLearning {

	
	public static void main(String[] args) {
		

		MobileUser mu = new SecondUser("kaniz"); 
		//mu = new SecondUser("kaniz");
		mu.call();
		mu.sendMessage();
		
		System.out.println();
		
		//mu = new FirstUser("yellin");
		MobileUser mu1 = new FirstUser("yellin");
		mu1.call();
		mu.sendMessage();
		MobileUser.myAnotherMSg();
		
		System.out.println(mu.myValue);
		
	}

}
