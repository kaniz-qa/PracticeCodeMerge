package com.java.oop.fourconcept;

import java.text.DecimalFormat;

public class Circle extends Shape {

	
	double r;
	Circle(double r){
		super(r,r);
	}
	void area() {
		
		double carea= Math.PI*(d1*d2);
		//DecimalFormat df = new DecimalFormat("00.00");
		//System.out.println("Circle area : "+ df.format(carea));
		System.out.println("Circle area : "+ String.format("%.3f",carea));
	}
}
