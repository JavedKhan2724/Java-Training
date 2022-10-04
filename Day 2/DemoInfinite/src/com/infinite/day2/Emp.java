package com.infinite.day2;

public class Emp {

	int empno;
	String name;
	double basic;
	@Override
	public String toString() {                            //GeneratingString
		return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	public Emp(int empno, String name, double basic) {    //Constructor using feild
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	public Emp() {                                       //constructor from superclass
		// TODO Auto-generated constructor stub
	}
	
	
}
//right click>source>GeneratetoString()
//right click>source>GenerateConstructor()