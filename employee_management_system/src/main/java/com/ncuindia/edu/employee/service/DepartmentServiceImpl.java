package com.ncuindia.edu.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncuindia.edu.employee.dao.DepartmentDao;
import com.ncuindia.edu.employee.entity.Department;

	@Service
	public class DepartmentServiceImpl implements DepartmentService {

	    @Autowired
	    private DepartmentDao departmentDao;

	    @Override
	    public List<Department> getAllDepartments() {
	        return departmentDao.getAllDepartments();
	    }

	    @Override
	    public Department getDepartmentById(String id) {
	        return departmentDao.getDepartmentById(id);
	    }

	    @Override
	    public Department createDepartment(Department department) {
	        return departmentDao.createDepartment(department);
	    }

	    @Override
	    public Department updateDepartment(String id, Department department) {
	        return departmentDao.updateDepartment(id, department);
	    }

	    @Override
	    public void deleteDepartment(String id) {
	        departmentDao.deleteDepartment(id);
	    }
	}

