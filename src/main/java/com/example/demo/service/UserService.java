package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {
	public int addUser(User user);
	
	public List<User> findAllUsers();
}
