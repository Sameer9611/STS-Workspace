package com.cybage.genworth.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.genworth.insurance.model.Policy;
import com.cybage.genworth.insurance.model.User;
import com.cybage.genworth.insurance.service.InsuranceTypeService;
import com.cybage.genworth.insurance.service.PolicyService;
import com.cybage.genworth.insurance.service.UserService;

/**
 *
 * @author Jeevan
 */
@RestController
@RequestMapping("/user")//>>>revised by me
public class UserController {

	@Autowired
	private UserService userService;
	
	
	private PolicyService policyService ;
	
	@PostMapping("/save")//a user-registration api
	public ResponseEntity<User> createUser(@RequestBody User user) throws Exception {
		User users = userService.saveUser(user);
		return ResponseEntity.ok().body(users);
	}

	@PostMapping("/savepolicy")//i corrected this one
	public ResponseEntity<Policy> createUserPolicy(@RequestBody Policy policy) throws Exception {
		Policy savedPolicy =policyService.savePolicy(policy);
		return ResponseEntity.ok().body(savedPolicy);

	}

	//Design Rest API which gives the list of city user
	@GetMapping("/getcity/{city}")
	public ResponseEntity<List<User>> getUserByCity(@PathVariable("city") String city) {
		List<User> user = userService.getListByCity(city);
		return ResponseEntity.ok().body(user);
	}

}
