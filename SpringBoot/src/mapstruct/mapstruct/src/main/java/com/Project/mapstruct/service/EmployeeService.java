package com.Project.mapstruct.service;


import com.Project.mapstruct.Entity.EmployeeEntity;
import com.Project.mapstruct.dto.EmployeeDto;


public interface EmployeeService {

   EmployeeEntity createEmployee(EmployeeDto employeeDto);


}
