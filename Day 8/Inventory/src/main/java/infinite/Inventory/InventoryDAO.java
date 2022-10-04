package infinite.Inventory;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InventoryDAO {

	Connection connection;
	PreparedStatement pst;
	
	public String stockid() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "SELECT stockid FROM stock ORDER BY stockid DESC LIMIT 1";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		String stockid = "S"+rs.getInt("stockid");
		return stockid;
	}
	
	public String addstockDAO(Inventory inventory) throws ClassNotFoundException, SQLException {
		String stockid = stockid();
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement("insert into stock (stockid,price,itemname,");
		pst.setString(1,stockid);
		pst.setDouble(2, inventory.getPrice());
		pst.setString(3, inventory.getItemName());
		pst.setInt(4, inventory.getQuantityAvail());
		
		pst.executeUpdate();
	return "Stock Added";
	}
	
	public Inventory searchstock(String stockid) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement("select * from stock where stockid=?");
		pst.setString(1, stockid);
		ResultSet rs = pst.executeQuery();
		
		Inventory inventory = null;
		if(rs.next()){
			inventory = new Inventory();
			inventory.setStockid(rs.getString("stockid"));
			inventory.setPrice(rs.getDouble("price"));
			inventory.setItemName(rs.getString("itemName"));
			inventory.setQuantityAvail(rs.getInt("quantityAvail"));
		}
		return inventory;
	}
	
	public List<Inventory> showstock() throws ClassNotFoundException, SQLException {
		List<Inventory> inventorylist = new ArrayList<Inventory>();
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement("select * from stock");
		ResultSet rs = pst.executeQuery();
		
		Inventory inventory = null;
		while(rs.next()){
			inventory = new Inventory();
			inventory.setStockid(rs.getString("stockid"));
			inventory.setPrice(rs.getDouble("price"));
			inventory.setItemName(rs.getString("itemName"));
			inventory.setQuantityAvail(rs.getInt("quantityAvail"));
			
			inventorylist.add(inventory);
		}
		return inventorylist;
	}
}
