package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.entities.UserRecord;
import com.capg.springboot.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userservice;
	
	@RequestMapping("/allusers")
	public List<UserRecord> getAllUsers(){
		return userservice.getAllUsers();
	}
	
	
	@RequestMapping(value="/adduser",method=RequestMethod.POST)
	public void addUser(@RequestBody UserRecord userRecord){
		userservice.addUser(userRecord);
	}
}
