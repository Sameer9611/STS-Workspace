package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private int networth;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getNetworth() {
		return networth;
	}
	public void setNetworth(int networth) {
		this.networth = networth;
	}
	@Override
	public String toString() {
		return "UserDataInput [id=" + id + ", name=" + name + ", surname=" + surname + ", networth=" + networth + "]";
	}
	public User(int id, String name, String surname, int networth) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.networth = networth;
	}
	
	
	
	
	

}
