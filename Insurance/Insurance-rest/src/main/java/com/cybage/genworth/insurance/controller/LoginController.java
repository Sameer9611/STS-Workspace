package com.cybage.genworth.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.genworth.insurance.model.User;
import com.cybage.genworth.insurance.service.UserService;

/**
 *
 * @author Jeevan
 */
@RestController
public class LoginController {

	@Autowired
	private UserService userService;

	/*
	 * This method is used to login the user to the insurance system.
	 */
	//revised by me
	@PostMapping("/login")//User is in request body that means whole user or( user some fields will be captured (in this case))
	public ResponseEntity<User> createUser(@RequestBody User user) throws Exception {
		String username = user.getUsername();
		String password = user.getUserpwd();
		user = userService.loginUser(username, password);
		return ResponseEntity.ok().body(user);
		
		//login controller does not have a seperate login service with a method of login:,it uses userservice loginUser method
	}

}
