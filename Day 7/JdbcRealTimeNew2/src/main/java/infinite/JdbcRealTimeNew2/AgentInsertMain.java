package infinite.JdbcRealTimeNew2;

import java.sql.SQLException;
import java.util.Scanner;

import infinite.JdbcRealTimeNew2.Agent;
import infinite.JdbcRealTimeNew2.AgentDAO;

public class AgentInsertMain {

	public static void main(String[] args) {
		Agent agent =  new Agent();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Agent Name ");
		agent.setName(sc.next());
		System.out.println("Enter City");
		agent.setCity(sc.next());
		System.out.println("Enter Gender");
		String gender = sc.next();
		if(gender.toUpperCase()=="MALE"){
			agent.setGender(Gender.MALE);
		}else{
			agent.setGender(Gender.FEMALE);
		}
		System.out.println("Enter Marital Status");
		agent.setMaritalstatus(sc.nextInt());
		System.out.println("Enter Premium");
		agent.setPremium(sc.nextInt());
		AgentDAO dao = new AgentDAO();
		try {
			System.out.println(dao.addAgent(agent));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
