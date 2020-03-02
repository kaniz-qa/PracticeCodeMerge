package com.java.string;

public class StringBuilderLearn {

	public static void main(String[] args) {
		
		
		
		
		
		
		StringBuilder s1=new StringBuilder("yellin");
		s1.append(" hasan");
		
		s1.delete(2, 5);
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1);
		
		
		s1.append(" " +7.5);
		System.out.println(s1);
			

	}

}
