package com.nagarro.springbootassignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.springbootassignment.dao.EmployeeDao;
import com.nagarro.springbootassignment.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	
	
	 public EmployeeServiceImpl() {
		 	 
		 }
	
	
	
	@Override
	public List<Employee> getEmployees() {
	
		return employeeDao.findAll();
	}



	@Override
	public Employee getEmployee(int employeeCode) {

		return employeeDao.getOne(employeeCode);
	}



	@Override
	public Employee addEmployee(Employee employee) {

		employeeDao.save(employee);
		return employee;
	}



	@Override
	public Employee updateEmployee(Employee employee) {

		employeeDao.save(employee);
		return employee;
	}



	@Override
	public Employee removeEmployee(int employeeCode) {

		Employee entity=employeeDao.getOne(employeeCode);
		employeeDao.delete(entity);
		return entity;
	}

}
