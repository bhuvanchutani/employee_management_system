package com.ncuindia.edu.employee.entity;

public class Department {
    private String id;
    private String name;
    // Add more properties as needed

    public Department() {
    }

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
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

    // Add getter and setter methods for additional properties if needed

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

