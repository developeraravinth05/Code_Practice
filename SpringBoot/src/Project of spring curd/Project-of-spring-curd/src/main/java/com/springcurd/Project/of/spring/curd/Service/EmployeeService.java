package com.springcurd.Project.of.spring.curd.Service;

import com.springcurd.Project.of.spring.curd.Entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity);

   public List<EmployeeEntity> getAllEmployees();

    public Optional<EmployeeEntity> getEmployeeById(int empId);

    public void deleteEmployeeById(int empId);
}
