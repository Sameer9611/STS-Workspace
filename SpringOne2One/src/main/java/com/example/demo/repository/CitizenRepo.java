package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Citizen;

@Repository
public interface CitizenRepo extends CrudRepository<Citizen, Integer>{
	
}
