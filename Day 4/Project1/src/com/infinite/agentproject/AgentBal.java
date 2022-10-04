package com.infinite.agentproject;

import java.util.List;

import com.infinite.employproject.Employ;
import com.infinite.employproject.EmployDAO;
import com.infinite.employproject.EmployException;

public class AgentBal {

	static StringBuilder sb = new StringBuilder();
	
	static AgentDAO dao = new AgentDAO();
	
	public String updateAgentBal(int agentid) {
		return dao.deleteAgentDao(agentid);
	}
	
	public String deleteAgentBal(int agentid) {
		return dao.deleteAgentDao(agentid);
	}
	public Agent searchAgentBal(int agentid){
		return dao.searchAgentDao(agentid);
	}
	
	public List<Agent> showAgentBal(){
		return dao.showAgentDao();
	}
	
	public String addagentBal(Agent agent) throws AgentException {
		if(isValid(agent)==false){
			throw new AgentException(sb.toString());
		}
		return dao.addEmployDao(agent);
	}
	
	public String updateAgentBal(Agent agent) throws AgentException {
		if(isValid(agent)==false){
			throw new AgentException(sb.toString());
		}
		return dao.updateAgentDao(agent);
	}
	
	public boolean isValid(Agent agent) {
		boolean valid=true;
		if(agent.getAgentId()<0){
			valid = false;
			sb.append("Agentcant be negative or zero\r\n");
		}
		if(agent.getFirstname().length()<3){
			valid = false;
			sb.append("Agent firstname contains min. 5 char..\r\n");
		}
		if(agent.getLastname().length()<3){
			valid = false;
			sb.append("Agent last name contains min. 5 char..\r\n");
		}
		
		if(agent.getPremium()<5000||agent.getPremium()>80000){
			valid = false;
			sb.append("Agent must be between 5000 to 80000\r\n");
		}
		return valid;
	}
}

