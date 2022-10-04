package com.infinite.cols;

public class Customer {

	int custId;
	String custName;
	String city;
	double cgp;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, String city, double cgp) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.city = city;
		this.cgp =cgp;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", city=" + city + ", cgp=" + cgp
				+ "]";
	}
	
}
