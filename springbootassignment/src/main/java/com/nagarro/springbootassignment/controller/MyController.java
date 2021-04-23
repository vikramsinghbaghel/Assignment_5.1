package com.nagarro.springbootassignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.springbootassignment.dao.EmployeeDao;
import com.nagarro.springbootassignment.entities.Employee;
import com.nagarro.springbootassignment.services.EmployeeService;

@RestController
public class MyController {
	
	@Autowired	
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeDao dao;
	
	
	
	//get all the employees
	@GetMapping("/employees")
	
	public List<Employee> getEmployees(){
	
		//return this.employeeService.getEmployees();
		return dao.findAll();
		
	}
	
	@GetMapping("/employees/{employeeCode}")
	public Employee getEmployee(@PathVariable String employeeCode)
	{
		return this.employeeService.getEmployee(Integer.parseInt(employeeCode));
	}
	
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return this.employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/employees/{employeeCode}")
	public ResponseEntity<HttpStatus> removeEmployee(@PathVariable String employeeCode){
		try {
			this.employeeService.removeEmployee(Integer.parseInt(employeeCode));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
