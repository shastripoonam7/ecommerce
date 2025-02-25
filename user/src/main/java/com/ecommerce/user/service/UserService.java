package com.ecommerce.user.service;

import java.util.List;
import java.util.UUID;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.user.model.User;
import com.ecommerce.user.repo.UserRepo;

@Service
public class UserService {
	
	private UserRepo userRepo;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public UserService(UserRepo userRepo ,BCryptPasswordEncoder bCryptPasswordEncoder ) {
		this.userRepo = userRepo;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	public User createUser(User user) {	
			
		String userId = UUID.randomUUID().toString();
		System.out.println("User details:"+user);
		user.setUserid(userId);
		user.setPassword_hash(bCryptPasswordEncoder.encode(user.getPassword_hash()));
		return userRepo.save(user);
		
	}
	
	public User findByUserId(String userId) {
		return userRepo.findById(userId).get();
	}
	
	public List<User> findAllUser(){
		return userRepo.findAll();
	}
	
	public User findByUsername(User user) {
		return userRepo.findByUsername(user.getUsername());
	}
}
