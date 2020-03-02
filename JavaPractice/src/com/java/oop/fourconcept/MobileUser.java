package com.java.oop.fourconcept;

public  abstract class MobileUser {

	String name;
	int myValue = 13;

	public MobileUser(String n) {
		this.name=n;
		
		//System.out.println("This is the default constructor");
	System.out.println(n);
	}
	
	
	
	void call() {
		System.out.println("Hello , I\'m calling u.....");
	}
	
	static void myAnotherMSg() {
		System.out.println("This is my static method");
	}
	 //int abc();
	abstract void sendMessage();
}
