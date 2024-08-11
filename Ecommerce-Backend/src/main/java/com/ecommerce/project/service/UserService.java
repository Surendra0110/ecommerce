package com.ecommerce.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.entity.User;
import com.ecommerce.project.repository.UserRepository;


import jakarta.transaction.Transactional;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public User createNewUser(User user) {
		return userRepository.save(user);
	}

}
