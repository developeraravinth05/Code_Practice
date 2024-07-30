package com.AOP.Project_AOP.Service;

import com.AOP.Project_AOP.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);


    List<Employee> getEmployee();
}
