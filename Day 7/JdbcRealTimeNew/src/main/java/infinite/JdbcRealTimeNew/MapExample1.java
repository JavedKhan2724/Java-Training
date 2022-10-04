package infinite.JdbcRealTimeNew;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapExample1 {

	public static void main(String[] args) {
		Map<Integer, String>data= new Hashtable<Integer, String>();
		data.put(1, "Javed");
		data.put(2, "Sachin");
		data.put(3, "Sahu");
		data.put(4, "Raghu");
		int key;
		String result;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Key(empno ");
		key = sc.nextInt();
		result = data.getOrDefault(key, "Not  Found");
		System.out.println(result);
	
	}
}
