package com.infinite.abs;

abstract class Training{
	abstract void name();
	abstract void email();
}

class Sindhu extends Training{

	@Override
	void name() {
		System.out.println("Name is Sindhu");
		
	}

	@Override
	void email() {
		System.out.println("Email is sindhu@gmail.com");
		
	}
	
}
class Javed extends Training{

	@Override
	void name() {
		System.out.println("Name is Javed...");
		
	}

	@Override
	void email() {
		System.out.println("Email is javed@gmail.com");
		
	}
	
}
class Yeshwant extends Training{


	@Override
	void name() {
		System.out.println("Name is Yeshwant.....");
		
	}

	@Override
	void email() {
		System.out.println("Email is yeshwant@gmail.com");
		
	}
	
}
public class AbsDemo {
	public static void main(String[] args) {
		Training[] arr = new Training[]{
				new Yeshwant(),
				new Sindhu(),
				new Javed()
				};
		for(Training t: arr){
			t.name();
			t.email();
		}
		}
}
