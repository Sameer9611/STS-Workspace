package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class AdharCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serialId;
	private String adharNum;
	private String signInitials;
	
	@JsonIgnore//else so many error related to jackson as file is null so confussion
	@OneToOne(mappedBy ="adharCard")
	private Citizen citizen;

	public int getSerialId() {
		return serialId;
	}

	public void setSerialId(int serialId) {
		this.serialId = serialId;
	}

	public String getAdharNum() {
		return adharNum;
	}

	public void setAdharNum(String adharNum) {
		this.adharNum = adharNum;
	}

	public String getSignInitials() {
		return signInitials;
	}

	public void setSignInitials(String signInitials) {
		this.signInitials = signInitials;
	}

	public Citizen getCitizen() {
		return citizen;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}

	@Override
	public String toString() {
		return "AdharCard [serialId=" + serialId + ", adharNum=" + adharNum + ", signInitials=" + signInitials
				+ ", citizen=" + citizen + "]";
	}
	
	

}
