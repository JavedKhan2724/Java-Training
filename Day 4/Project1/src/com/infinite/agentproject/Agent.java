package com.infinite.agentproject;

public class Agent {

	private int agentId;
	private String firstname;
	private String lastname;
	private PayMode payMode;
	private double premium;
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", firstname=" + firstname + ", lastname=" + lastname + ", payMode="
				+ payMode + ", premium=" + premium + "]";
	}
	public Agent(int agentId, String firstname, String lastname, PayMode payMode, double premium) {
		super();
		this.agentId = agentId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.payMode = payMode;
		this.premium = premium;
	}
	public Agent() {

	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public PayMode getPayMode() {
		return payMode;
	}
	public void setPayMode(PayMode payMode) {
		this.payMode = payMode;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
}
