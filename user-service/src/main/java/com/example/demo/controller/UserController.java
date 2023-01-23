package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.server.UserService;
import com.example.demo.valueobjects.ResponseTemplete;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    
	@Autowired
	private UserService userservice;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("Inside saveUser of usercontroller");
		return userservice.saveUser(user);
	}
    @GetMapping("/{id}")	
	public ResponseTemplete getUserWithDepartment(@PathVariable("id")Long userId) {
    	log.info("Inside getUserWithDepartment of userController");
	  return userservice.getUserWithDepartment(userId);
	
}
}
