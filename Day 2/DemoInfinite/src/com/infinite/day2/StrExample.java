package com.infinite.day2;

public class StrExample {

	public void show() {
		String s1="Welcome to Java Programming.... By Trainer Prasanna";
		System.out.println("length of String is : "+s1.length());
		System.out.println("First Occurence of Char 'o' is : "+s1.indexOf('o'));
		System.out.println("Char at 5th Position is : "+s1.charAt(5));
		System.out.println("Lower Case : "+s1.toLowerCase());
		System.out.println("Upper Case : "+s1.toUpperCase());
		String s2="Javed",s3="raj",s4="Javed";
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
	}
	public static void main(String[] args) {
		StrExample obj = new StrExample();
		obj.show();
	}
}
