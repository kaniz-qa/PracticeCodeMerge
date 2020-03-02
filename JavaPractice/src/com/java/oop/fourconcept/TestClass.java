package com.java.oop.fourconcept;

public class TestClass {

	public static void main(String[] args) {
		
		EncapsolutionLearning obj = new EncapsolutionLearning();
		/*
		 * obj.display("Yellin", 7);
		 *  obj.age=7; 
		 *  obj.name="yellin";
		 *  obj.display();
		 */
		
		obj.setName("yellin");
		System.out.println("Name: "+obj.getName());
		
		obj.setAge(7);
		System.out.println("Age: "+obj.getAge());
	}

}
