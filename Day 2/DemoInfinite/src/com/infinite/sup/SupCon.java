package com.infinite.sup;

class Employee {

	int empno;
	String name;
	double basic;
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	public Employee(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
}
class Bhagya extends Employee{

	public Bhagya(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}
public class SupCon{
	public static void main(String[] args) {
		Bhagya obj = new Bhagya(1, "Bhagya", 56789);
		System.out.println(obj);
	}
}