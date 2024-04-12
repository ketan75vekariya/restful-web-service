package com.first.rest.webservice.restfulwebservice.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoservice {
	
	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User(1,"Adam", LocalDate.now().minusYears(30)));
		users.add(new User(2,"Smith", LocalDate.now().minusYears(24)));
		users.add(new User(3,"Andy", LocalDate.now().minusYears(31)));
		users.add(new User(4,"Samantha", LocalDate.now().minusYears(28)));
		users.add(new User(5,"Vickey", LocalDate.now().minusYears(35)));
		users.add(new User(6,"Amanda", LocalDate.now().minusYears(21)));
		users.add(new User(7,"Sarah", LocalDate.now().minusYears(22)));
		users.add(new User(8,"wilson", LocalDate.now().minusYears(32)));
	}
	
	public List<User> findAll(){
		return users;
	}

	public User findById(int id) {
		Predicate<? super User> predicate = user -> user.getID().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}
}
