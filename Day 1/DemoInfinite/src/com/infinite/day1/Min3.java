package com.infinite.day1;

public class Min3 {

	public void check(int a,int b,int c) {
		int m=a;
		if (m>b){
			m=b;
		}
		if(m>c){
			m=c;
		}
		System.out.println("minimum Value " +m);
//		if(a<=b){
//			if(a<=c){
//				System.out.println("A is minimum");
//			}
//			else{
//				System.out.println("C is minimum");
//			}
//		}
//		else{
//			System.out.println("B is minimum");
//		}
		
	}
	public static void main(String[] args) {
		int a,b,c;
		a=6;
		b=5;
		c=1;
		Min3 obj = new Min3();
		obj.check(a, b, c);
	}
}
