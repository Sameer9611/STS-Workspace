package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.SendEmail;
import com.velocity.model.Users;
import com.velocity.service.MailService;

@RestController
public class UsersController {

	@Autowired
	private MailService notificationService;

	@Autowired
	private Users user;

	@GetMapping("/myfirst")
	public String getData() {
		return "nayan";
	}

	/**
	 * 
	 * @return
	 */
	@GetMapping("/send-mail")
	public String send() {

		/*
		 * Creating a User with the help of User class that we have declared and setting
		 * Email address of the sender.
		 */
		user.setEmailAddress("rautnayan95@gmail.com"); // Receiver's email address
		/*
		 * Here we will call sendEmail() for Sending mail to the sender.
		 */
		try {
			notificationService.sendEmail(user);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Congratulations! Your mail has been send to the user.";
	}

	
	
	@PostMapping("/sendMailData")
	public String sendMail(@RequestBody SendEmail email) {
	
	   notificationService.sendEmailFromRequestData(email);
	
	
	   return "Congratulations! Your mail has been send to the user.";
	
	}
	
}
