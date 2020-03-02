package com.java.string;

public class StringBufferLearn {

	public static void main(String[] args) {
		
		String s1="Kaniz";
		StringBuffer sb3=new StringBuffer(s1);
		System.out.println(sb3);
		
		
		StringBuffer sb= new StringBuffer("Yellin ");
		System.out.println(sb);
		
		sb.append("Hasan");
		System.out.println(sb);
		sb.setLength(5);
		System.out.println(sb);
		
		sb.delete(1, 5);
		System.out.println(sb);
		System.out.println();
		sb.append( 7.5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
		
		StringBuffer sb1= new StringBuffer("The quick brown fox ");
		sb1.reverse();
		System.out.println(sb1);
	}

}
