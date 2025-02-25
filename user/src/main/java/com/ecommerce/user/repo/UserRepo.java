package com.ecommerce.user.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.user.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,String>{
	
	public User findByUsername(String username);

}
