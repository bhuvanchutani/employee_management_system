package com.ncuindia.edu.employee.entity;

public class Employee {
    private String id;
    private String name;
    private int age;
    private String department;
    private double salary;
    private String role;

    public Employee() {
    	
    }

    public Employee(String id, String name, int age, String department, String role,double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.role=role;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
