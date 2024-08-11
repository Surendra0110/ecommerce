package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.entity.User;
import com.ecommerce.project.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value="/registerNewUser", consumes="application/json")
	public User registerNewUser(@RequestBody User user) {
		return userService.createNewUser(user);
	}

}
