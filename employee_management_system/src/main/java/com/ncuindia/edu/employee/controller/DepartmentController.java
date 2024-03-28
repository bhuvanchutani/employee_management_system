package com.ncuindia.edu.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncuindia.edu.employee.entity.Department;
import com.ncuindia.edu.employee.service.DepartmentService;

	@RestController
	@RequestMapping("/app")
	public class DepartmentController {
    @Autowired
	    private DepartmentService departmentService;
	    @GetMapping("/departments")
	    public List<Department> fetchDepartments() {
	        return departmentService.getAllDepartments();
	    }

	    @GetMapping("/departments/{id}")
	    public Department fetchDepartment(@PathVariable String id) {
	        return departmentService.getDepartmentById(id);
	    }

	    @PostMapping("/departments")
	    public Department createDepartment(@RequestBody Department department) {
	        return departmentService.createDepartment(department);
	    }

	    @PutMapping("/departments/{id}")
	    public Department updateDepartment(@PathVariable String id, @RequestBody Department department) {
	        return departmentService.updateDepartment(id, department);
	    }

	    @DeleteMapping("/departments/{id}")
	    public void deleteDepartment(@PathVariable String id) {
	        departmentService.deleteDepartment(id);
	    }
	}

