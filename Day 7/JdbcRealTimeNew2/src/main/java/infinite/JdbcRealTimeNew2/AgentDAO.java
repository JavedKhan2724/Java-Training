package infinite.JdbcRealTimeNew2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import infinite.JdbcRealTimeNew2.ConnectionHelper;
import infinite.JdbcRealTimeNew2.Agent;

public class AgentDAO {

	Connection connection;
	PreparedStatement pst;
	
	public String addAgent(Agent agent) throws ClassNotFoundException, SQLException{
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Agent(name,city,gender,,maritalstatus,premium)"+"values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, agent.getName());
		pst.setString(2, agent.getCity());
		pst.setObject(3, agent.getGender());
		pst.setInt(4, agent.getMaritalstatus());
		pst.setDouble(5, agent.getPremium());
		pst.executeUpdate();
		return "Record Inserted....";
	}
	
	public String updateAgent(Agent agentNew) throws ClassNotFoundException, SQLException {
		Agent agent = searchAgent(agentNew.getAgentid());
		if(agent!=null){
			String cmd = "update agent set name=?,city=?,gender=?,"
					+ "Basic=? where empno=?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setString(1, employNew.getName());
			pst.setString(2, employNew.getDept());
			pst.setString(3, employNew.getDesign());
			pst.setInt(4, employNew.getBasic());
			pst.setInt(5, employNew.getEmpno());
			pst.executeUpdate();
			return "Employ Record Updated...";
		}
		return "Record Not Found...";
	}
	
	public String deleteEmploy(int empno) throws ClassNotFoundException, SQLException{
		Employ employ = searchEmploy(empno);
		if(employ!=null){
			connection = ConnectionHelper.getConnection();
			String cmd = "delete from Employ where empno=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.executeUpdate();
			return "Record deletd...";
		}
		return "Employ Record Not Found";
	}
	
	
	public Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException{
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ where empno=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		if(rs.next()){
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setDept(rs.getString("dept"));
			employ.setDesign(rs.getString("desig"));
			employ.setBasic(rs.getInt("basic"));
		}
		return employ;
	}
	
	
	public List<Agent> showAgent() throws ClassNotFoundException, SQLException {
		List<Agent> agentList = new ArrayList<Agent>();
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Agent";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Agent agent = null;
		while(rs.next()){
			agent = new Agent();
			agent.setAgentid(rs.getInt("agentid"));
			agent.setName(rs.getString("name"));
			agent.setCity(rs.getString("city"));
			if(rs.getString("gender")=="MALE"){
				agent.setGender(Gender.MALE);
			}else{
				agent.setGender(Gender.FEMALE);
			}
			agent.setMaritalstatus(rs.getInt("maritalstatus"));
			agent.setPremium(rs.getInt("premium"));
			agentList.add(agent);
		}
		return agentList;
	}
}
