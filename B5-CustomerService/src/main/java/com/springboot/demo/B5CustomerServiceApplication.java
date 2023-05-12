package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class B5CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(B5CustomerServiceApplication.class, args);
	}

}
