package com.infinite.day2;

public class EmpDemo {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.empno=1;
		e1.name="Javed";
		e1.basic=87898;
		
		Emp e2 = new Emp();
		e2.empno=2;
		e2.name="Rahul";
		e2.basic=78678;
		
		Emp e3 = new Emp();
		e3.empno=3;
		e3.name="Komal";
		e3.basic=45674;
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
