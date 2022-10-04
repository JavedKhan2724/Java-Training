package infinite.JDBC_Demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AgentInsertMain {

	public static void main(String[] args) throws SQLException {
		String name,city,gender;
		int maritalstatus;
		double premium;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter City");
		city = sc.next();
		System.out.println("Enter Gender");
		gender = sc.next();
		System.out.println("Enter Marital Status");
		maritalstatus  = sc.nextInt();
		System.out.println("Enter Premium");
		premium = sc.nextDouble();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","india@123");
			String cmd = "insert into Agent(name,city,gender,maritalstatus,premium)"+"values (?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setString(1,  name);
			pst.setString(2,  city);
			pst.setString(3,  gender);
			pst.setInt(4, maritalstatus);
			pst.executeUpdate();
			System.out.println("Agent Record Inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
