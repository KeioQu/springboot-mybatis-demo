package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/add")
	public int addUser(@RequestParam("userName") String userName){
		User user = new User();
		user.setUserName(userName);
		return userService.addUser(user);
	}
	
	@RequestMapping("/all")
	public Object findAll(){
		return userService.findAllUsers();
	}
}
