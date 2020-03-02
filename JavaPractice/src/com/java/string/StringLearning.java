package com.java.string;

public class StringLearning {

	public static void main(String[] args) {
		String s1="Bangladesh is my country. ";
		String s5 = new String("Bangladesh is my country. ");
		String s6 = new String("Bangladesh is my country. ");
		
		
		System.out.println(s1);
		
		int len=s1.length();
		System.out.println(len);
		
		String s2="I LOVE MY COUNTRY .";
		String s3=s1+s2;
		System.out.println(s3);
		
		String s4= s1.concat(s2.toLowerCase()).concat("which i belongs to .");
		System.out.println(s4);
		
		if(s1==s5) {
			System.out.println("What i say it's true . ");
		}
		else {
			System.out.println("Not true love !");
		}

		if(s1.equals(s5)) {
			System.out.println("What i say it's true . ");
		}
		else {
			System.out.println("Not true love !");
		}
		if(s1.contains(s5)) {
			System.out.println("What i say it's true . ");
		}
		else {
			System.out.println("Not true love !");
		}
		if(s1.equalsIgnoreCase(s6)) {
			System.out.println("What i say it's true . ");
		}
		else {
			System.out.println("Not true love !");
		}
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		boolean s7=s1.contains("love");
		System.out.println(s7);
		boolean s8=s2.contains("LOVE");
		System.out.println(s8);
		
		boolean s9 = s1.isEmpty();
		System.out.println(s9);
		
		
		boolean s10=s1.startsWith("B");
		
		System.out.println(s10);
		
		boolean s11=s1.endsWith("country");
		boolean s12=s1.endsWith("country. ");
		System.out.println(s11);
		System.out.println(s12);
		
		String[] name = {"Sarwat","Kaniz","Abdullah","Rabeya"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println();
		for (String x: name) {
			System.out.println(x);
		}
		
		
		char s13=s1.charAt(3);
		System.out.println(s13);
		
		int s14=s2.codePointAt(4);
		System.out.println((char)s14 +"  "+ s14);
		
		int s15= s1.indexOf('g');
		System.out.println(s15);
		
		int s16 = s1.lastIndexOf('y');
		System.out.println(s16);

		int s17=s1.codePointAt(23);
		System.out.println((char)s17 +"  "+ s17);
		
		String s18="    This   is   kaniz     .";
		System.out.println(s18);
		
		String s19=s18.trim();
		System.out.println(s19);
		
		String s20=s18.replace("kaniz", "Yellin");
		System.out.println(s20);
		
		
		String s21="I can write java code.";
		String[] s22=s21.split(" ");
		
		for (String x: s22) {
			System.out.println(x);
		}
		
		String s23="I can write-java-code.";
		String[] s24=s23.split(" ");
		
		for (String y: s24) {
			System.out.println(y);
		}
		
		System.out.println();
		System.out.println("##########################");
		String s25="I_can_write java code.";
		String[] s26=s25.split("_");
		
		for (String z: s26) {
			System.out.println(z);
		}
		System.out.println("=============================");
	}

}












