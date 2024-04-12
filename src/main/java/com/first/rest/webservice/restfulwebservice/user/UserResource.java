package com.first.rest.webservice.restfulwebservice.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id ){
		return service.findById(id);
	}
	
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		service.save(user);
	}
}
