package com.ecommerce.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.project.entity.User;

public interface UserRepository extends CrudRepository<User, String> {

}
