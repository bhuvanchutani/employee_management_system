package com.ncuindia.edu.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ncuindia.edu.employee.controller.EmployeeController;
import com.ncuindia.edu.employee.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    public EmployeeServiceImpl(EmployeeController employeecontroller) {
    }
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(String id) {
		// TODO Auto-generated method stub
		
	}

}
