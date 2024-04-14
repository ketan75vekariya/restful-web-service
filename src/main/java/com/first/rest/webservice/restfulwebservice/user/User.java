package com.first.rest.webservice.restfulwebservice.user;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
@Entity(name = "user_details")
public class User {
	@Id
	@GeneratedValue
	private Integer ID;
	
	@Size(min =2, message = "Name should have atleast 2 character")
	@JsonProperty("user_name")
	private String name;
	
	@Past(message = "Birth date should be in the past")
	@JsonProperty("birth_date")
	private LocalDate birthdate;
	public User(Integer iD, String name, LocalDate birthdate) {
		super();
		ID = iD;
		this.name = name;
		this.birthdate = birthdate;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	@Override
	public String toString() {
		return "User [ID=" + ID + ", name=" + name + ", birthdate=" + birthdate + "]";
	}
	
}
