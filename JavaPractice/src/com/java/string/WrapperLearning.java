package com.java.string;

public class WrapperLearning {

	public static void main(String[] args) {
		
		
		//primitive ====> object
		int x=30;
		Integer y=Integer.valueOf(x);
		System.out.println(y);
		
		Integer z=x;
		System.out.println(z); //autoboxing

		
		
		//object  ====> primitive
		
		Double d= new Double(10.50);
		System.out.println(d);
		
		double e=d.doubleValue();
		System.out.println(e);
		
		
		
		
	}

}
