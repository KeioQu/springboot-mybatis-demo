package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.User;

public interface UserDAO {
	public int insertUser(User user);
	
	public List<User> findAllUsers();
}
