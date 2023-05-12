package com.springboot.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.entity.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@GetMapping("/getall")
	public List<Customer> getAllCustomer() {
		List<Customer> cusList = new ArrayList<>();

		cusList.add(new Customer(101, "Nayan", "Pune"));
		cusList.add(new Customer(105, "Rohan", "Nasik"));
		cusList.add(new Customer(101, "Abhik", "Mumbai"));

		return cusList;

	}

}
