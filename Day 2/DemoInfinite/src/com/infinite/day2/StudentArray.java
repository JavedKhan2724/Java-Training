package com.infinite.day2;

public class StudentArray {

	public static void main(String[] args) {
		Student[] students = new Student[]{
				new Student(1," Javed","Lucknow",9.8),
				new Student(2," Rahul","Puna",9.6),
				new Student(3," Raghu","Puna",9.6),
				new Student(4," Sachi","Puna",8.9),
		};
		for(Student student : students){
			System.out.println(student);
		}
	}
}
