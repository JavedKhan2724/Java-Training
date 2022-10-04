package com.infinite.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo2 {

	public static void main(String[] args) {
		SortedSet names = new TreeSet<>();
		names.add("Bhargavi");
		names.add("Javed");
		names.add("Zara");
		names.add("Raj");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
