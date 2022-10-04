package com.infinite.day2;

public class BoxingExmple {

	public static void main(String[] args) {
		int a=12;
		String str ="Hello";
		double sal=53467.78;
		
		//Implementing Boxing
		Object ob1=a;
		Object ob2=str;
		Object ob30=sal;
		
		//Implementing UnBoxing
		int a1=(Integer)ob1;
		String s1 = (String)ob2;
		double b1 = (Double)ob30;
		
		System.out.println(a1);
		System.out.println(s1);
		System.out.println(b1);
	}
}
