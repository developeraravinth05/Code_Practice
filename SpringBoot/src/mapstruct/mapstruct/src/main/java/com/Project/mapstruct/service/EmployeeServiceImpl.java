package com.Project.mapstruct.service;


import com.Project.mapstruct.Entity.EmployeeEntity;
import com.Project.mapstruct.populator.EmployeePopulator;
import com.Project.mapstruct.dto.EmployeeDto;
import com.Project.mapstruct.repositroy.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EmployeeServiceImpl implements  EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeEntity createEmployee(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity= EmployeePopulator.INSTANCE.employeeMapper(employeeDto);
        employeeEntity.setCreationDate(new Date());
       return   employeeRepository.save(employeeEntity);
    }
}
