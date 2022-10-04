package com.infinite.day1;

public class Voting {

	public void check(int age) {
		if(age<18){
			System.out.println("Not Eligible");
		}
		else{
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) {
		int age=19;
		Voting obj = new Voting();
		obj.check(age);
	}
}
