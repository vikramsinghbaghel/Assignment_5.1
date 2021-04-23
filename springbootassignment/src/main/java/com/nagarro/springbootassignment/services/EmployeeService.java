package com.nagarro.springbootassignment.services;

import java.util.List;

import com.nagarro.springbootassignment.entities.Employee;

public interface EmployeeService {
	
	//it will be responsible to return all the employees info
	public List<Employee> getEmployees();
	
	// it will be responsible to return the information about the particular employee using the employee code 
	public Employee getEmployee( int employeeCode);
	
	// it will be responsible to add the new employee to the employee list.
	public Employee addEmployee(Employee employee);
	
	//it will be responsible to update the employee information of the particular employee.
	public Employee updateEmployee(Employee employee);
	
	//it will be responsible to delete the employee from the employee list
	public Employee removeEmployee(int employeeCode);
	
	
	

}
