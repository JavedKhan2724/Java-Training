package com.infinite.day2;

import javax.activation.MailcapCommandMap;

public class EmpArray {

	public static void main(String[] args) {
		Emp[] arr = new Emp[]{
				new Emp(1," Javed",55678),
				new Emp(2," Rahul",23456),
				new Emp(3," Raghu",12456),
				new Emp(4," Sachin",89456),
		};
		for(Emp emp : arr){
			System.out.println(emp);
		}
	}
}
