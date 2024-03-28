package com.ncuindia.edu.employee.service;

import java.util.List;

import com.ncuindia.edu.employee.entity.Employee;

public interface EmployeeService {
	   List<Employee> getAllEmployee();

	   Employee getEmployeeById(String id);

	   Employee createEmployee(Employee employee);

	   Employee updateEmployee(String id, Employee employee);

	   void deleteEmployee(String id);
	}
	    
