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

import com.ncuindia.edu.employee.entity.Employee;
import com.ncuindia.edu.employee.service.EmployeeService;

@RestController
@RequestMapping({"/app"})
public class EmployeeController {
   @Autowired
   private EmployeeService employeeService;

   @GetMapping({"/employees"})
   public List<Employee> fetchEmployees() {
      return this.employeeService.getAllEmployee();
   }

   @GetMapping({"/employees/{id}"})
   public Employee fetchEmployee(@PathVariable String id) {
      return this.employeeService.getEmployeeById(id);
   }

   @PostMapping({"/employees"})
   public Employee createEmployee(@RequestBody Employee employee) {
      return this.employeeService.createEmployee(employee);
   }

   @PutMapping({"/employees/{id}"})
   public Employee updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
      return this.employeeService.updateEmployee(id, employee);
   }

   @DeleteMapping({"/employees/{id}"})
   public void deleteEmployee(@PathVariable String id) {
      this.employeeService.deleteEmployee(id);
   }
}
