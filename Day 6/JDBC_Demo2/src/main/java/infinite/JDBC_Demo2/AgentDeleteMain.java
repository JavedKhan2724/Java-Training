package infinite.JDBC_Demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AgentDeleteMain {

	public static void main(String[] args) throws SQLException {
		int agentid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Agent ID ");
		agentid = sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","india@123");
			String cmd = "delete from Agent where agentid = ?";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setInt(1, agentid);
			pst.executeUpdate();
			System.out.println("*** RECORD DELETD ***");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
