package infinite.JDBC_Demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AgentSearchMain {

	public static void main(String[] args) throws SQLException {
		int agentid;
		Scanner scanner = new Scanner(System.in);
		agentid = scanner.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","india@123");
			String cmd = "select * from Agent where agentid=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, agentid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
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
		}
	}
}
