package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "citizen_details")
public class Citizen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serialNo;
	private String name;
	private String surname;
	
	@OneToOne( cascade = CascadeType.ALL)//we dont even have any layer for Adharcard still we can save its all data:due to cascading
	private AdharCard adharCard;
	
	@OneToMany(fetch = FetchType.EAGER,cascade  = CascadeType.ALL)
	private Set<BankAccounts> accounts;

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public AdharCard getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(AdharCard adharCard) {
		this.adharCard = adharCard;
	}

	public Set<BankAccounts> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<BankAccounts> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Citizen [serialNo=" + serialNo + ", name=" + name + ", surname=" + surname + ", adharCard=" + adharCard
				+ ", accounts=" + accounts + "]";
	}
	


	

}
