//Write a program to convert centigrade to radians
package com.infinite.day1;

public class Ques1 {

	public void calc (double C){
		double R=(4*C)/5;
		System.out.println("Radian Value is :" +R);
	}
	public static void main(String[] args) {
		double C=15;
		Ques1 obj = new Ques1();
		obj.calc(C);
	}
}
