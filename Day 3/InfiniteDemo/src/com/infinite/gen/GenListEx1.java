package com.infinite.gen;

import java.util.ArrayList;
import java.util.List;

public class GenListEx1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Kishore");
		names.add("Javed");
		names.add("Karan");
		names.add("Kamal");
		System.out.println("Names are ");
		for (String s: names) {
			System.out.println(s);
		}
	}
}
