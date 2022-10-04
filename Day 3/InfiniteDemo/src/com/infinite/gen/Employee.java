package com.infinite.gen;

public class Employee {

	int empno;
	String name;
	double basic;
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	public Employee(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
}
