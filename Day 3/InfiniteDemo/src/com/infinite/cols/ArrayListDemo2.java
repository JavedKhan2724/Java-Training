package com.infinite.cols;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1,"Javed1",5765));
		employList.add(new Employ(2,"Javed2",4765));
		employList.add(new Employ(3,"Javed3",3765));
		employList.add(new Employ(4,"Javed4",2765));
		
		for (Object obj : employList) {
			Employ employ = (Employ)obj;
			System.out.println(employ);
		}
	}
}
