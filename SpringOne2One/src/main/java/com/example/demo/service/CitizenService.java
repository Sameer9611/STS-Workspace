package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Citizen;
import com.example.demo.repository.CitizenRepo;

@Service
public class CitizenService {
	@Autowired
	private CitizenRepo citizenRepo;
	
	public Citizen SaveCitizen(Citizen citizen) {
		citizenRepo.save(citizen);
		return citizen;
	}
	public List<Citizen> getCitizens() {
		List<Citizen> listCitizens=(List<Citizen>) citizenRepo.findAll();
		return listCitizens;
	}
	

}
