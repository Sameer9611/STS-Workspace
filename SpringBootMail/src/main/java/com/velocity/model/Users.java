package com.velocity.model;

import org.springframework.stereotype.Component;

@Component
public class Users {

	private String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAdd) {
		this.emailAddress = emailAdd;
	}
}
