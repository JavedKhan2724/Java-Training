package com.infinite.cols;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Customer e1 = (Customer)o1;
		Customer e2 = (Customer)o2;
		return e2.custName.compareTo(e1.custName);
	}

}