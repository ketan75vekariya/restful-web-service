package com.first.rest.webservice.restfulwebservice.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundExeption extends RuntimeException {
	public UserNotFoundExeption(String message) {
		super(message);
	}
}
