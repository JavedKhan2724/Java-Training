package com.infinite.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
//		Comparator comparator =new NameComparator();
		Comparator comparator =new BasicComparator();
		SortedSet employList = new TreeSet(comparator);
		employList.add(new Employ(1,"Javed",5765));
		employList.add(new Employ(2,"Sohail",4765));
		employList.add(new Employ(3,"Zafar",3765));
		employList.add(new Employ(4,"Ashu",2765));
		for (Object object : employList) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
	}
}
