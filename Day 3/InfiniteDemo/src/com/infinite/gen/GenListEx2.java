package com.infinite.gen;

import java.util.ArrayList;
import java.util.List;

public class GenListEx2 {

	public static void main(String[] args) {
		List<Employee> employList = new ArrayList<Employee>();
		employList.add(new Employee(1,"Javed",5765));
		employList.add(new Employee(2,"Sohail",4765));
		employList.add(new Employee(3,"Zafar",3765));
		employList.add(new Employee(4,"Ashu",2765));
		for (Employee e : employList) {
			System.out.println(e);
		}
	}
}
