package com.ncuindia.edu.employee.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ncuindia.edu.employee.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(String id) {
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(String id, Employee employee) {
        for (Employee e : employeeList) {
            if (e.getId().equals(id)) {
                e.setName(employee.getName());
                e.setAge(employee.getAge());
                e.setDepartment(employee.getDepartment());
                e.setSalary(employee.getSalary());
                return e;
            }
        }
        return null;
    }

    @Override
    public void deleteEmployee(String id) {
        employeeList.removeIf(employee -> employee.getId().equals(id));
    }
}
