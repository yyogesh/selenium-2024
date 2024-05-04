package com.example.service;

import com.example.model.Employee;

public class EmployeeService {

    public Employee getEmployeeById(int employeeId) {
        Employee ajay = new Employee("Ajay", "1", "IT");
        return ajay;
    }

    public void saveEmployee(Employee employee) {
        System.out.println("Save employee called");
    }

    public void getEmployeeByDepartment() {
        System.out.println("get Department by DepartmentName");
    }
}
