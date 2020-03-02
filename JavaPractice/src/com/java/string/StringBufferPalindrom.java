package com.java.string;

public class StringBufferPalindrom {

	public static void main(String[] args) {
		
		String s="madam";
		StringBuffer sb1=new StringBuffer(s);
		//StringBuffer sb2=sb1.reverse();
		String sb2=sb1.reverse().toString();
		
		if(sb1.equals(sb2)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("no palindrom");
		}
		
		if(s==sb2) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("no palindrom");
		}
		
		if(s.equals(sb2)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("no palindrom");
		}
		
		

	}

}
