package com.tmc.registration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tmc.registration.jpa.User;
import com.tmc.registration.jpa.UserRepository;

public class UserServiceImpl implements UserService {


	@Autowired
	UserRepository userRepository;  


	@Override
	public List<User> findAll() {
			List<User> users = (List<User>) userRepository.findAll();  
		return users;
	}

	@Override
	public void save(User user) {
		userRepository.save(user); 
	}

	@Override
	public Optional<User> findById(int id) { 
		Optional<User> user = userRepository.findById(id);
		return user;
	}

	@Override
	public void delete(int id) {
		userRepository.deleteById(id);
	}

}
