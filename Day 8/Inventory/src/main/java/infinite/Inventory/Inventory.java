package infinite.Inventory;

public class Inventory {

	private String stockid;
	private String ItemName;
	private double price;
	private int QuantityAvail;
	@Override
	public String toString() {
		return "Inventory [stockid=" + stockid + ", ItemName=" + ItemName + ", price=" + price + ", QuantityAvail="
				+ QuantityAvail + "]";
	}
	public Inventory(String stockid, String itemName, double price, int quantityAvail) {
		super();
		this.stockid = stockid;
		ItemName = itemName;
		this.price = price;
		QuantityAvail = quantityAvail;
	}
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantityAvail() {
		return QuantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		QuantityAvail = quantityAvail;
	}
	
}
