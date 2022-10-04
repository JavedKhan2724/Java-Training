package com.infinite.cols;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
//		Set names = new HashSet();
		Set names = new LinkedHashSet<>();
		names.add("Javed");
		names.add("Sohail");
		names.add("Zafar");
		names.add("Ayaz");
		names.add("Adil");
		names.add("Hasir");
		names.add("Hasan");
		names.add("Hasnain");
		names.add("Aquib");
		names.add("Abdulla");
		names.add("Tabish");
		names.add("Hasir");
		names.add("Hasan");
		names.add("Hasnain");
		names.add("Husain");
		names.add("Amir");
		names.add("Sanchit");
		names.add("Swapnil");
		names.add("Javed");
		names.add("Sohail");
		names.add("Zafar");
		names.add("Ayaz");
		names.add("Adil");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
