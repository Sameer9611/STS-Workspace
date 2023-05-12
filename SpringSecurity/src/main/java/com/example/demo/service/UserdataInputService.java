package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserDataInputRepo;

@Service
public class UserdataInputService {
	
	@Autowired
	private UserDataInputRepo dataInputRepo;
	
	public User saveUserInput(User u) {
		User user=dataInputRepo.save(u);
		return user;
		
	}

}
