package infinite.JDK;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
	public static void main(String[] args) {
		List<Employ> employList=new ArrayList<Employ>();
		   employList.add(new Employ(1, "Alok Maurya", 87654));
		   employList.add(new Employ(2, "Ayush", 87654));
		   employList.add(new Employ(3, "Shashwat", 87654));
		   employList.add(new Employ(4, "Javed", 83212));
		   employList.add(new Employ(5, "Sumanth", 67654));
		   employList.add(new Employ(6, "Akashj", 88534));
		   employList.add(new Employ(7, "Riya", 92654));
		   
		   List<String> mapDemo=employList.stream().map(x->x.getName()).collect(Collectors.toList());
		   System.out.println("Employ Name");
		   mapDemo.forEach(System.out::println);
	}
	   
}
