package com.AOP.Project_AOP.Contoller;


import com.AOP.Project_AOP.Entity.Employee;
import com.AOP.Project_AOP.Service.EmployeeService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
    EmployeeService employeeService;

@PostMapping("/create")
public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
          Employee saveEmployee= employeeService.createEmployee(employee);
          return new ResponseEntity<>(saveEmployee, HttpStatus.ACCEPTED);
}


    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getEmployee(){
        List<Employee> getEmployee= employeeService.getEmployee();
        return new ResponseEntity<>(getEmployee, HttpStatus.ACCEPTED);
    }


}

