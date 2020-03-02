package com.java.oop.fourconcept;

public class Rectangle extends Shape {
	
	//double d1,d2;
	Rectangle(double d1,double d2){
		super(d1,d2);
	}
	void area() {
		
		double result=d1*d2;
		System.out.println("Rectangle area : "+ result);
	}

}
