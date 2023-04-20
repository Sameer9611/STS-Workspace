package com.example.demo.entity;
//pojo classes: used as to table

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empID;
	private String empName;
	private String empCity;
	private int salary;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empCity=" + empCity + ", salary=" + salary
				+ "]";
	}
	public Employee(int empID, String empName, String empCity, int salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empCity = empCity;
		this.salary = salary;
	}
	
	
	
	

}
