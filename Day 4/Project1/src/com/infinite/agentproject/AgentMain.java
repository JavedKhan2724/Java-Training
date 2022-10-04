package com.infinite.agentproject;

import java.util.List;
import java.util.Scanner;

import com.infinite.employproject.Employ;
import com.infinite.employproject.EmployException;
import com.infinite.employproject.Gender;

public class AgentMain {

	static Scanner sc = new Scanner(System.in);
	static AgentBal bal =  new AgentBal();
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("-------------");
			System.out.println("1. Add Agent");
			System.out.println("2. Show Agent");
			System.out.println("3. Search Agent");
			System.out.println("4. Delete Agent");
			System.out.println("5. Update Agent");
			System.out.println("6. Exit");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				try {
					addAgentMain();
				} catch (AgentException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2:showAgentMain();
				break;
			case 3:searchAgentMain();
				break;
			case 4:deleteAgentMain();	
				break;
			case 5:try {
					updateAgentMain();
				} catch (AgentException e) {
					System.err.println(e.getMessage());
				}
				break;

			default:
				break;
			}
		} while (choice!=6);
	}
	
	public static void updateAgentMain() throws AgentException {
		Agent agent = new Agent();
		System.out.println("Enter Agent Id U Want to Update ");
		agent.setAgentId(sc.nextInt());
		System.out.println("Enter Agent First Name ");
		agent.setFirstname(sc.next());
		System.out.println("Enter Agent Last Name ");
		agent.setLastname(sc.next());
		System.out.println("Enter PayMode ");
		String paymode = sc.next();
		if(paymode.toUpperCase().equals("YEARLY")){
			agent.setPayMode(PayMode.YEARLY);
		}
		if(paymode.toUpperCase().equals("HALFYEARLY")){
			agent.setPayMode(PayMode.HALFYEARLY);
		}
		if(paymode.toUpperCase().equals("QUARTERLY")){
			agent.setPayMode(PayMode.QUARTERLY);
		}
		System.out.println("Enter Premium");
		agent.setPremium(sc.nextDouble());
		System.out.println(bal.updateAgentBal(agent));
		
		
}

public static void deleteAgentMain(){
	int agentid;
	System.out.println("Enter Agent Id U Want to Delete");
	agentid = sc.nextInt();
	System.out.println(bal.deleteAgentBal(agentid));
}

public static void searchAgentMain(){
	int agentid;
	System.out.println("Enter Agent Id U Want to Search");
	agentid = sc.nextInt();
	Agent agentFound=bal.searchAgentBal(agentid);
	if(agentFound!=null){
		System.out.println(agentFound);
	}else{
		System.out.println("***Record Not Found***");
	}
}
	
	public static void showAgentMain(){
		List<Agent> agentList = bal.showAgentBal();
		for (Agent agent : agentList) {
			System.out.println(agent);
		}
	}
	public static void addAgentMain() throws AgentException{
		Agent agent = new Agent();
		
		System.out.println("Agent Id : ");
		agent.setAgentId(sc.nextInt());
		
		System.out.println("Agent First Name : ");
		agent.setFirstname(sc.next());
		System.out.println("Agent Last Name : ");
		agent.setLastname(sc.next());
		
		System.out.println("Pay Mode : ");
		String pay =sc.next();
		if(pay.toUpperCase().equals("YEARLY")){
			agent.setPayMode(PayMode.YEARLY);
		}
		if(pay.toUpperCase().equals("HALFYEARLY")){
			agent.setPayMode(PayMode.HALFYEARLY);
		}
		
		System.out.println("Premium : ");
		agent.setPremium(sc.nextDouble());
		
		System.out.println(bal.addagentBal(agent));
	}
}


