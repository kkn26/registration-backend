package com.tmc.registration.controller;
 
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
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
@RequestMapping("/api")
public class RegistrationController {
	
	@Autowired
	UserRepository userRepository; 
	
	@CrossOrigin(origins = "https://tmcregistration.azurewebsites.net")
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(required = false, defaultValue = "World") String name) {
		System.out.println("==== Get Greeting ====");
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	
	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		try {
			System.out.println("Coming to createUser.");
			User mUser = new User();
			mUser = user;
			userRepository.save(mUser); 
			return new ResponseEntity<User>(mUser, HttpStatus.CREATED);
			
		} catch (Exception e) {
			System.out.println("Error :"+ e.getMessage());
			return new ResponseEntity<>(null, 
					    HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	 
	@GetMapping("/viewReport")
	 public List<User> findUsers() {
        User user = new User();
		user.setFirstName("Khai");
		 
		List<User> list = new ArrayList<User>();
		list.add(user);
        return list; //(List<User>) userRepository.findAll();
    }
	

}
