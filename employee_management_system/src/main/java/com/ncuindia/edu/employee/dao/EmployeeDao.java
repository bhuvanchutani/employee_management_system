package com.ncuindia.edu.employee.dao;

import java.util.List;

import com.ncuindia.edu.employee.entity.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();
    Employee getEmployeeById(String id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(String id, Employee employee);
    void deleteEmployee(String id);
	
	
}
