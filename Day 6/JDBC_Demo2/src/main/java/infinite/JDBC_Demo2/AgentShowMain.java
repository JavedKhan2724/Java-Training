package infinite.JDBC_Demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AgentShowMain {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","india@123");
			System.out.println("Connected");
			String cmd = "select * from agent";
			PreparedStatement pStatement = connection.prepareStatement(cmd);
			ResultSet rs = pStatement.executeQuery();
			while(rs.next()){
				System.out.println("Employ No "+rs.getInt("agentid"));
				System.out.println("Agent Name "+rs.getString("name"));
				System.out.println("Agent City "+rs.getString("city"));
				System.out.println("Agent Gender "+rs.getString("gender"));
				System.out.println("Agent Marital Status "+rs.getInt("maritalstatus"));
				System.out.println("Agent Premium "+rs.getDouble("premium"));
				System.out.println("-------------------------");
				
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
