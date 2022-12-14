package infinite.hibdemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Agent")
public class Agent {
   
	@Id
	@Column(name="agentid")
	 private int agentid;
	
	@Column(name="name")
     private String name;
	
	@Column(name="city")
   private String city;
	
	@Enumerated(EnumType.STRING)
	@Column(name="gender")
	private Gender gender;
     
	@Column(name="maritalstatus")
	private int maritalstatus;
    
	@Column(name="premium")
	private double premium;
	
	public int getAgentid() {
		return agentid;
	}
	public void setAgentid(int agentid) {
		this.agentid = agentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(int maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public double getPremium() {
		return premium;
	}
	public void setPrimium(double premium) {
		this.premium = premium;
	}
	
	@Override
	public String toString() {
		return "Agent [agentId=" + agentid + ", name=" + name + ", city=" + city + ", gender=" + gender
				+ ", maritalstatus=" + maritalstatus + ", premium=" + premium + "]";
	}
     
     
	
}
