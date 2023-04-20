package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Citizen;
import com.example.demo.service.CitizenService;

@RestController
@RequestMapping("/Citizen")
public class CitizenController {
	private static final Logger logger=LoggerFactory.getLogger(CitizenController.class);
	
	@Autowired
	private CitizenService citizenService;
	
	@PostMapping("/saveCitizen")
	public Citizen saveCitizen(@RequestBody Citizen citizen) {
		logger.info("IN SAVE CITIZEN:"+citizen);//to check where we are getting the errors>like debug points
		citizenService.SaveCitizen(citizen);
		logger.info("AFTER CITIZEN SERVICE:"+citizen);
		return citizen;
	}
	@GetMapping("/getCitizens")
	public List<Citizen> getCitizens() {
		List<Citizen> listCitizens=citizenService.getCitizens();
		 return listCitizens;

	}

}
