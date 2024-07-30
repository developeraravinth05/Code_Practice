package com.AOP.Project_AOP.Service;

import com.AOP.Project_AOP.Entity.Employee;
import com.AOP.Project_AOP.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee createEmployee(Employee employee) {
        Employee employee1 = employeeRepo.save(employee);
        return employee1;
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeRepo.findAll();
    }


}
