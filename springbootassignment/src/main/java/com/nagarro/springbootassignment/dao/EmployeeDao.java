package com.nagarro.springbootassignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.springbootassignment.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	

}
