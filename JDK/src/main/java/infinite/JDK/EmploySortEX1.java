package infinite.JDK;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class EmploySortEX1 {
   public static void main(String[] args) {
	   List<Employ> employList=new ArrayList<Employ>();
	   employList.add(new Employ(1, "Alok Maurya", 87654));
	   employList.add(new Employ(2, "Ayush", 87654));
	   employList.add(new Employ(3, "Shashwat", 87654));
	   employList.add(new Employ(4, "Javed", 83212));
	   employList.add(new Employ(5, "Sumanth", 67654));
	   employList.add(new Employ(6, "Akashj", 88534));
	   employList.add(new Employ(7, "Riya", 92654));
	   
	   Collections.sort(employList,(e1,e2)->{
		   return e1.getName().compareTo(e2.getName());
	   });
	   System.out.println("Sort By Name ");
	   employList.forEach(System.out::println);
	   
	   System.out.println("Sort By Basic-wise  ");
	   Collections.sort(employList,(e1,e2)->{
		   return (int)(e1.getBasic()-e2.getBasic());
	   });
	   employList.forEach(System.out::println);
}
}
