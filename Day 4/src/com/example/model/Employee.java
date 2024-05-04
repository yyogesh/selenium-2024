package com.example.model;

public class Employee {
    final String companyName;
    private String name;
    private String Id;
    private String departmentName;

    public Employee(String name, String id, String departmentName) {
        this.name = name;
        this.Id = id;
        this.departmentName = departmentName;
        companyName = "asdf";
    }

    final public void getEmployeeByName() {
        // You can not override it
        // you can not extend

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
