package com.infinite.day1;

public class Max3 {

	public void check(int a,int b,int c) {
		int m=a;
		if (m<b){
			m=b;
		}
		if(m<c){
			m=c;
		}
		System.out.println("maximum Value " +m);
//		if(a>=b){
//			if(a>=c){
//				System.out.println("A is maximum");
//			}
//			else{
//				System.out.println("C is maximum");
//			}
//		}
//		else{
//			System.out.println("B is maximum");
//		}
		
	}
	public static void main(String[] args) {
		int a,b,c;
		a=6;
		b=5;
		c=10;
		Max3 obj = new Max3();
		obj.check(a, b, c);
	}
}
