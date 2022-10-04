package com.infinite.day2;

public class StudentDemo {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.sno=1;
		student1.name=" Javed";
		student1.city=" Lucknow";
		student1.cgp=9.8;
		
		Student student2 = new Student();
		student2.sno=2;
		student2.name=" Rahul";
		student2.city=" London";
		student2.cgp=9.7;
		
		System.out.println(student1);
		System.out.println(student2);
	}
}