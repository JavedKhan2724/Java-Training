package infinite.Inventory;

import java.sql.SQLException;

public class ShowStock {

	public static void main(String[] args) {
		InventoryDAO dao = new InventoryDAO();
		try {
			for(Inventory inventory : dao.showstock()){
				System.out.println(inventory);
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
