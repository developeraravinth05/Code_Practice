package com.springcurd.Project.of.spring.curd.Service;

import com.springcurd.Project.of.spring.curd.CustomException.BusinessException;
import com.springcurd.Project.of.spring.curd.Entity.EmployeeEntity;
import com.springcurd.Project.of.spring.curd.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired()
    EmployeeRepository employeeRepository;
    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
        try {

           EmployeeEntity saveEmployee= employeeRepository.save(employeeEntity);
            if (saveEmployee.getName().isEmpty()) {
                throw new BusinessException("600","Employee name is empty");
            }
            return saveEmployee;

        }catch (Exception e){
            throw  new BusinessException("601","Employee is empty"+e.getMessage());

        }

    }

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> getEmployeeById(int empId) {
       return employeeRepository.findById(empId);

    }

    @Override
    public void deleteEmployeeById(int empId) {
         employeeRepository.deleteById(empId);
    }


}
