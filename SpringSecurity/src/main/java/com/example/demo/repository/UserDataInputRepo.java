package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.User;



//Welcome to the magic of Spring Data.
//You are correct that interfaces on their own don't do anything. 
//However, here Spring Data JPA is automatically creating an implementation of that interface for you when you run the application.

public interface UserDataInputRepo extends CrudRepository<User, Integer> {
	

}
