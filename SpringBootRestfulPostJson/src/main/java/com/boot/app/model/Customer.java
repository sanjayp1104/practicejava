package com.boot.app.model;

public class Customer {
	private int custNo;
	private String name;
	private String country;
	
	public Customer() {
	}

	public Customer(int custNo, String name, String country) {
		super();
		this.custNo = custNo;
		this.name = name;
		this.country = country;
	}

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/*
	 * @Override public String toString() { return "Customer [custNo=" + custNo +
	 * ", name=" + name + ", country=" + country + "]"; }
	 */
	
	
}	
