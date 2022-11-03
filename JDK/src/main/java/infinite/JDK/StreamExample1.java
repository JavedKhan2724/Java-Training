package infinite.JDK;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {
   public static void main(String[] args) {
	   List<Employ> employList=new ArrayList<Employ>();
	   employList.add(new Employ(1, "Alok Maurya", 87654));
	   employList.add(new Employ(2, "Ayush", 87654));
	   employList.add(new Employ(3, "Shashwat", 87654));
	   employList.add(new Employ(4, "Javed", 83212));
	   employList.add(new Employ(5, "Sumanth", 67654));
	   employList.add(new Employ(6, "Akashj", 88534));
	   employList.add(new Employ(7, "Riya", 92654));
	   
	   Stream<Employ> employFilter=employList.stream().filter(x-> x.getBasic()>=90000);
	   System.out.println("Filter Data");
	   employFilter.forEach(System.out::println);
}
}
