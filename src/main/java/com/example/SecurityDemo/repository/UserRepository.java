package com.example.SecurityDemo.repository;

import org.springframework.stereotype.Repository;

import com.example.SecurityDemo.model.User;

@Repository
public class UserRepository {
	
	public User findUserByEmail(String email) {
		return new User(email,"123456","Farhan","Tanvir");
	}
}
