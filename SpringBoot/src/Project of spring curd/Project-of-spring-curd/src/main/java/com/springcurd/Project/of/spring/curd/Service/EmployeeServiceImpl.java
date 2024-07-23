package com.springcurd.Project.of.spring.curd.Service;

import com.springcurd.Project.of.spring.curd.Entity.EmployeeEntity;
import com.springcurd.Project.of.spring.curd.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired()
    EmployeeRepository employeeRepository;
    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity getEmployeeById(int empId) {
        return employeeRepository.findById(empId).get();
    }

    @Override
    public void deleteEmployeeById(int empId) {
         employeeRepository.deleteById(empId);
    }


}
