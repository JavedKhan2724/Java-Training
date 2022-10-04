package com.infinite.day1;

public class CaseExample1 {

	public void show(int n) {
		switch (n) {
		case 1:
			System.out.println("Hi I am Javed Khan...");
			break;
		case 2:
			System.out.println("Hi I am Sachin...");
			break;
		case 3:
			System.out.println("Hi I am Raghuvendra...");
			break;
		case 4:
			System.out.println("Hi I am Raj...");
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}
	public static void main(String[] args) {
		int n=1;
		CaseExample1 obj = new CaseExample1();
		obj.show(n);
	}
}
