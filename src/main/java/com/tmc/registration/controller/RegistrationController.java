package com.tmc.registration.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tmc.registration.jpa.User;
import com.tmc.registration.jpa.UserRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/register")
public class RegistrationController {
	
	@Autowired
	UserRepository userRepository; 
	
	@GetMapping("/")
	public @ResponseBody ResponseEntity<String> get() {
	    return new ResponseEntity<String>("GET Response", HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		try {
			System.out.println("Coming to createUser.");
			User mUser = new User();
			mUser = user;
			userRepository.save(mUser); 
			return new ResponseEntity<User>(mUser, HttpStatus.CREATED);
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, 
					    HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/viewReport")
	 public List<User> findUsers() {
 
        return (List<User>) userRepository.findAll();
    }
	

}
