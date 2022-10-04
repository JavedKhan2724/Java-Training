package com.infinite.day1;

public class OddShow {

	public void show(int n) {
		int i=1;
		while(i<n){
			System.out.println("Odd " +i);
			i=i+2;
		}
	}
	public static void main(String[] args) {
		int n=20;
		OddShow obj = new OddShow();
		obj.show(n);
	}
}
