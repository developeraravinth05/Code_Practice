package com.Project.mapstruct.controller;


import com.Project.mapstruct.Entity.EmployeeEntity;
import com.Project.mapstruct.dto.EmployeeDto;
import com.Project.mapstruct.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<EmployeeEntity> addEmployee(@Valid @RequestBody EmployeeDto empDto){
        return new ResponseEntity<>(employeeService.createEmployee(empDto), HttpStatus.CREATED);

    }


}
