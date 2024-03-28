package com.ncuindia.edu.employee.dao;

import java.util.List;

import com.ncuindia.edu.employee.entity.Department;

public interface DepartmentDao {
	List<Department> getAllDepartments();
    Department getDepartmentById(String id);
    Department createDepartment(Department department);
    Department updateDepartment(String id, Department department);
    void deleteDepartment(String id);
}
