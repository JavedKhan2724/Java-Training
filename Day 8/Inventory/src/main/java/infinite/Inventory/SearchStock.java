package infinite.Inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchStock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stockid;
		System.out.println("Enter StockId");
		stockid = sc.next();
		sc.close();
		
		InventoryDAO dao = new InventoryDAO();
		try {
			Inventory inventoryDetails = dao.searchstock(stockid);
			if(inventoryDetails!=null){
				System.out.println(inventoryDetails);
			}else {
				System.out.println("No Record Found..");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
