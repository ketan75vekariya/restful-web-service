package com.first.rest.webservice.restfulwebservice.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoservice {
	
	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 0;
	static {
		users.add(new User(++userCount,"Adam", LocalDate.now().minusYears(30)));
		users.add(new User(++userCount,"Smith", LocalDate.now().minusYears(24)));
		users.add(new User(++userCount,"Andy", LocalDate.now().minusYears(31)));
		users.add(new User(++userCount,"Samantha", LocalDate.now().minusYears(28)));
		users.add(new User(++userCount,"Vickey", LocalDate.now().minusYears(35)));
		users.add(new User(++userCount,"Amanda", LocalDate.now().minusYears(21)));
		users.add(new User(++userCount,"Sarah", LocalDate.now().minusYears(22)));
		users.add(new User(++userCount,"wilson", LocalDate.now().minusYears(32)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		user.setID(++userCount);
		users.add(user);
		return user;
	}

	public User findById(int id) {
		Predicate<? super User> predicate = user -> user.getID().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}
}
