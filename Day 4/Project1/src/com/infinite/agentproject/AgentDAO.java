package com.infinite.agentproject;

import java.util.ArrayList;
import java.util.List;

import com.infinite.employproject.Employ;

public class AgentDAO {

	static List<Agent> agentList;

	static{
		agentList = new ArrayList<Agent>();
	}
	
	public String updateAgentDao(Agent agentNew) {
		Agent agentFound = searchAgentDao(agentNew.getAgentId());
		if(agentFound!=null){
			for(Agent agent: agentList){
				if(agent.getAgentId()==agentNew.getAgentId()){
					agent.setFirstname(agentNew.getFirstname());
					agent.setLastname(agentNew.getLastname());
					agent.setPayMode(agentNew.getPayMode());
					agent.setPremium(agentNew.getPremium());
				}
			}
			return "Agent Record Updated...";
		}
		return "Agent Record Not Found...";
	}
	
	public String deleteAgentDao(int agentid) {
		Agent agentFound = searchAgentDao(agentid);
		if(agentFound!=null){
			agentList.remove(agentFound);
			return "Agent record Deleted...";
		}
		return "Agent Record Not Found...";
	}
	
	public Agent searchAgentDao(int agentid){
		Agent agentFound = null;
		for (Agent agent : agentList) {
			if(agent.getAgentId()==agentid){
				agentFound = agent;
			}
		}
		return agentFound;
	}
	public List<Agent> showAgentDao(){
		return agentList;
	}
	
	public String addEmployDao(Agent agent){
		agentList.add(agent);
		return "Agent Record Inserted..";
	}	
}
