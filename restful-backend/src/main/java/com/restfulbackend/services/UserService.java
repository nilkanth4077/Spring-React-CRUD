package com.restfulbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfulbackend.entities.User;
import com.restfulbackend.repos.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	public User createUser(User user) {
		return userRepo.save(user);
	}

}
