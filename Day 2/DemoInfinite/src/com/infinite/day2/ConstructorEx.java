package com.infinite.day2;

public class ConstructorEx {

	static{
		System.out.println("Static Constructor...");
	}
	
	ConstructorEx(){
		System.out.println("Instance Constructor...");
	}
	
	public static void main(String[] args) {
		new ConstructorEx();
	}
}
