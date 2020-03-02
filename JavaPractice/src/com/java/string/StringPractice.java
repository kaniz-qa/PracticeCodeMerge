package com.java.string;

import java.text.DecimalFormat;

public class StringPractice {

	public static void main(String[] args) {
		String a = "yellin is tricky.";
		System.out.println(a.replace('e', '3'));
		
		
		String s = "madam";
		StringBuffer sb = new StringBuffer(s);
		String s1 = sb.reverse().toString();
		
		System.out.println(s1);
		System.out.println(s);
		
		if(s.equals(s1)) {
			System.out.println("pallindrom");
		}else {
			System.out.println("not pallindrom");
		}
		
		
		double e = 22/7f ;
		System.out.println(e);
		System.out.println(String.format("%.3f", e));
		System.out.printf("%.3f" , e);
		System.out.println();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(e));
		
		String st = "Bangladesh";
		for (int i = 0; i < st.length()-1; i++) {
			
			System.out.print(" "+st.charAt(i));
		}
		

	}

}
