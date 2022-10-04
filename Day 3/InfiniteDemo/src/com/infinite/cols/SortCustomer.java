package com.infinite.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortCustomer {

	public static void main(String[] args) {
		Comparator comparator =new NameComparator();
		SortedSet custList = new TreeSet(comparator);
		custList.add(new Customer(1,"Javed","CNB",5765));
		custList.add(new Customer(2,"Sohail","LKO",4765));
		custList.add(new Customer(3,"Zafar","LKO",3765));
		custList.add(new Customer(4,"Ashu","CNB",2765));
		for (Object object : custList) {
			Customer customer = (Customer)object;
			System.out.println(customer);
		}
	}
}
