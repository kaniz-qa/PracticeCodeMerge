package com.java.oop.fourconcept;

public class Teacher extends Person {

	String qualification;
	
	@Override
	void display() {
		
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		System.out.println("Qualification : "+ qualification);
	}
}
