package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserdataInputService;

@RestController
@RequestMapping("/user")
public class UserInputController {
	@Autowired
	private UserdataInputService inputService;
	
	@PostMapping("/saveuser")
	public User saveuser(@RequestBody User user) {
		User user2=inputService.saveUserInput(user);
		return user2;
	}

}
