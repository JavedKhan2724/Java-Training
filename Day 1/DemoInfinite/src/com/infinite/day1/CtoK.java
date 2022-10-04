package com.infinite.day1;

public class CtoK {
	
	public void calc(double c){
		double k=c+273;
		System.out.println("Kelvin Value is " +k);
	}
	
	public static void main(String[] args) {
		double c=45;
	    CtoK obj = new CtoK();
		obj.calc(c);
	}

}
