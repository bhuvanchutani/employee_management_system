package com.ncuindia.edu.employee.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ncuindia.edu.employee.entity.Department;

public class DepartmentDaoImpl {
	@Repository
	public class DeapartmentDaoImpl implements DepartmentDao {

	    private List<Department> departmentList = new ArrayList<>();

	    @Override
	    public List<Department> getAllDepartments() {
	        return departmentList;
	    }

	    @Override
	    public Department getDepartmentById(String id) {
	        for (Department department : departmentList) {
	            if (department.getId().equals(id)) {
	                return department;
	            }
	        }
	        return null;
	    }

	    @Override
	    public Department createDepartment(Department department) {
	        departmentList.add(department);
	        return department;
	    }

	    @Override
	    public Department updateDepartment(String id, Department department) {
	        for (Department d : departmentList) {
	            if (d.getId().equals(id)) {
	                d.setName(department.getName());
	                // Add more properties to update if necessary
	                return d;
	            }
	        }
	        return null;
	    }

	    @Override
	    public void deleteDepartment(String id) {
	        departmentList.removeIf(department -> department.getId().equals(id));
	    }
	}

}
