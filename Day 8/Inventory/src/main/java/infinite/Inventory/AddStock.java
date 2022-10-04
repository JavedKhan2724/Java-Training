package infinite.Inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class AddStock {
	
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Stock Price");
		inventory.setPrice(sc.nextDouble());
		
		System.out.println("Enter Stock Name");
		inventory.setItemName(sc.next());
		
		System.out.println("Enter Quantity");
		inventory.setQuantityAvail(sc.nextInt());
		sc.close();
		
		InventoryDAO dao = new InventoryDAO();
		try {
			System.out.println(dao.addstockDAO(inventory));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
