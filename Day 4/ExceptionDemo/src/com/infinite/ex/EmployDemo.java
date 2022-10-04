package com.infinite.ex;

public class EmployDemo {

	public static void main(String[] args) {
		Employ employ =  new Employ();
		employ.setEmpno(1);
		employ.setName("Javed");
		employ.setBasic(88234.22);
		
		System.out.println("Employee No. "+employ.getEmpno());
		System.out.println("Employee Name "+employ.getName());
		System.out.println("Employee Basic "+employ.getBasic());
	}
}
