package com.java.oop.fourconcept;

public class ValidOverloading {

	
	float mymethod(int a, float b) {
		return a+b;
	}
	float mymethod(float var1, int var2) {
		return var1 + var2;
	}
	
	public static void main(String[] args) {
		
		ValidOverloading valid = new ValidOverloading();
		//valid.mymethod(45, 20.7);
	}

}
