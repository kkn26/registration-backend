package com.tmc.registration.service;

import java.util.List;
import java.util.Optional;

import com.tmc.registration.jpa.User;

public interface UserService { 

	    List <User> findAll();

	    void save(User user);

	    Optional <User> findById(int id);

	    void delete(int id);
 

}
