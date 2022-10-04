package com.infinite.abs;

abstract class Vehicle{
	abstract void name();
	abstract void type(); 
}

class PassionPro extends Vehicle{

	@Override
	void name() {
		System.out.println("Name is Passion Pro...");
		
	}

	@Override
	void type() {
		System.out.println("It's 2 Wheeler..");
		
	}
	
}

class Scross extends Vehicle{

	@Override
	void name() {
		System.out.println("Name is Scross");
		
	}

	@Override
	void type() {
		System.out.println("It's 4 wheeler...");
		
	}
	
}
public class AbsTest {

	public static void main(String[] args) {
		Vehicle[] arr = new Vehicle[]{
		new PassionPro(),
		new Scross(),
		};
		for (Vehicle vehicle : arr) {
			vehicle.name();
			vehicle.type();
		}
	}
}
