package com.tmc.registration.controller;
 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

import com.tmc.registration.jpa.User; 
import com.tmc.registration.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class RegistrationController {
	
	@Autowired
	UserService service;  
	
	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		try {
			System.out.println("Coming to createUser.");
			User mUser = new User();
			mUser = user;
			service.save(mUser); 
			return new ResponseEntity<User>(mUser, HttpStatus.CREATED);
			
		} catch (Exception e) {
			System.out.println("Error :"+ e.getMessage());
			return new ResponseEntity<>(null, 
					    HttpStatus.INTERNAL_SERVER_ERROR);
		}
	} 
	 
	@GetMapping("/viewReport")
	 public List<User> findUsers() { 
		List<User> users =  service.findAll(); 
        return users; 
    }  
}
