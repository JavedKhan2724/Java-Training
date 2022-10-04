package infinite.JdbcRealTimeNew2;

import java.sql.SQLException;
import java.util.List;

import infinite.JdbcRealTimeNew2.Agent;
import infinite.JdbcRealTimeNew2.AgentDAO;

public class AgentShowMain {

	public static void main(String[] args) {
		AgentDAO dao = new AgentDAO();
		try {
			List<Agent> employList = dao.showAgent();
			for (Agent agent : agentList) {
				System.out.println(agent);
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
