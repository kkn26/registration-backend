package com.tmc.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmc.registration.jpa.User;
import com.tmc.registration.jpa.UserRepository;

@RestController
@RequestMapping("/register")
public class RegistrationController {
	
	@Autowired
	UserRepository userRepository; 
	
	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		try { 
			User mUser = new User();
			mUser = user;
			userRepository.save(mUser); 
			return new ResponseEntity<User>(mUser, HttpStatus.CREATED);
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, 
					    HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}
