package com.infinite.cols;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Kishore");
		names.add("Sachin");
		names.add("Javed");
		System.out.println("Names are ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
