package com.infinite.day2;

public class BoxingExmple2 {

	public void show(Object ob){
		String type = ob.getClass().getSimpleName();
		System.out.println(type);
		if(type.equals("Integer")){
			System.out.println("Integer Casting...");
			int x = (Integer)ob;
		}
		if(type.equals("Double")){
			System.out.println("Double Casting...");
			double x= (Double)ob;
		}
		if(type.equals("String")){
			System.out.println("String Casting...");
			String x= (String)ob;
		}
	}
	public static void main(String[] args) {
		int a= 12;
		String str = "Hello";
		double bas =83567.78;
		BoxingExmple2 obj = new BoxingExmple2();
		obj.show(a);
		obj.show(str);
		obj.show(bas);
	}
}
