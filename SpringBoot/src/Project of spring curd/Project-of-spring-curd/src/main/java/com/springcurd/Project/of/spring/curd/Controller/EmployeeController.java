package com.springcurd.Project.of.spring.curd.Controller;


import com.springcurd.Project.of.spring.curd.Entity.EmployeeEntity;
import com.springcurd.Project.of.spring.curd.Repository.EmployeeRepository;
import com.springcurd.Project.of.spring.curd.Service.EmployeeService;
import com.springcurd.Project.of.spring.curd.Service.EmployeeServiceImpl;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/createEmployee")
    public ResponseEntity<EmployeeEntity> createEmployee(@RequestBody EmployeeEntity employeeEntity) {
        EmployeeEntity saveEmployee = employeeService.createEmployee(employeeEntity);
        return new ResponseEntity<EmployeeEntity>(saveEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/getEmployee")
    public ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
        List<EmployeeEntity> getAll = employeeService.getAllEmployees();
        return new ResponseEntity<List<EmployeeEntity>>(getAll, HttpStatus.OK);
    }

    @GetMapping("/getEmployee/{empId}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable("empId") int empId){
        EmployeeEntity getByID = employeeService.getEmployeeById(empId);
        return new ResponseEntity<EmployeeEntity>(getByID, HttpStatus.OK);
    }


    @DeleteMapping("/deleteEmployee/{empId}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable("empId") int empId){
        employeeService.deleteEmployeeById(empId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/updateEmployee")
    public ResponseEntity<EmployeeEntity> updateEmployee(@RequestBody EmployeeEntity employeeEntity) {
        EmployeeEntity saveEmployee = employeeService.createEmployee(employeeEntity);
        return new ResponseEntity<EmployeeEntity>(saveEmployee, HttpStatus.CREATED);
    }
}