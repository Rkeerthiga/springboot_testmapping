package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.User;
import com.example.model.PersonRegisterRequest;
import com.example.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addPerson")
	public User savePerson(@RequestBody PersonRegisterRequest personRegisterRequest) {
		return userService.savePerson(personRegisterRequest);
	}

}
