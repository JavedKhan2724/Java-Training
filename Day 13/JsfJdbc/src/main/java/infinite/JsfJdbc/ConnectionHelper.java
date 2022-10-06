package infinite.JsfJdbc;

import java.util.ResourceBundle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {

	public static Connection getConnection() throws ClassNotFoundException,SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String driver =  rb.getString("driver");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String pwd = rb.getString("password");
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pwd);
		return con;
	}
}
