package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class B5MicroserviceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(B5MicroserviceEurekaServerApplication.class, args);
	}

}
