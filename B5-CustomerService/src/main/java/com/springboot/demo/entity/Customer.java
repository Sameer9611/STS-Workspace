package com.springboot.demo.entity;

public class Customer {

	private int custId;
	private String name;
	private String city;

	public Customer(int custId, String name, String city) {
		super();
		this.custId = custId;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", city=" + city + "]";
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
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

}
