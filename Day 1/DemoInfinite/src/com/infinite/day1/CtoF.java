package com.infinite.day1;

public class CtoF {
	public void calc(double c){
		double F=((9*c)/5)+32;
		System.out.println("Fahrenheit value "+F);
	}
	public static void main(String[] args) {
		double c=37;
		CtoF obj = new CtoF();
		obj.calc(c);
	}

}
