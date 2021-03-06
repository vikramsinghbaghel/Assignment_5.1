package com.nagarro.springbootassignment.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

@Entity
public class Employee {

	// creating the variable with employee details
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code;
	private String name;
	private String location;
	private String email;
	private String dob;

	public Employee() {
		super();
		
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Employee(int code, String name, String location, String email, String dob) {
		super();
		this.code = code;
		this.name = name;
		this.location = location;
		this.email = email;
		this.dob = dob;
	}
	
	
	
}
