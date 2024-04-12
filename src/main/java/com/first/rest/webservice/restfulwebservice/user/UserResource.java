package com.first.rest.webservice.restfulwebservice.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	private UserDaoservice service;
	
	public UserResource(UserDaoservice service) {
		this.service= service;
	}
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
}
