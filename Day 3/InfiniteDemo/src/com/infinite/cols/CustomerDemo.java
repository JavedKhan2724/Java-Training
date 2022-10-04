package com.infinite.cols;

import java.util.ArrayList;
import java.util.List;

public class CustomerDemo {

	public static void main(String[] args) {
		List customerList = new ArrayList();
		customerList.add(new Customer(1,"Javed","Unnao",9999));
		customerList.add(new Customer(2,"Raghu","Unnao",8999));
		customerList.add(new Customer(3,"Zara","Unnao",9999));
		customerList.add(new Customer(4,"Sachin","Unnao",9999));
		
		for (Object obj : customerList) {
			Customer customer = (Customer)obj;
			System.out.println(customer);
		}
	}
}
