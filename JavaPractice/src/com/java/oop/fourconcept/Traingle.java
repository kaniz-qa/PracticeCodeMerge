package com.java.oop.fourconcept;

public class Traingle extends Shape{

	//double d1,d2;
	Traingle(double d1,double d2){
		super(d1,d2);
	}
	
	void area() {
		
		double tarea=0.5* d1*d2;
		System.out.println("Traingle area : "+ tarea);
	}
}
