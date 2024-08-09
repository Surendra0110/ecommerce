package com.ecommerce.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.entity.Role;

@RestController
public class RoleController {
	
	@PostMapping("/addNewRole")
	public Role addNewRole(Role role) {
		return role;
	}

}
