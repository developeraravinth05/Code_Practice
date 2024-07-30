package com.springcurd.Project.of.spring.curd.Controller;


import com.springcurd.Project.of.spring.curd.CustomException.BusinessException;
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
import java.util.Optional;

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

//    @GetMapping("/getEmployee/{empId}")
//    public ResponseEntity<?> getEmployeeById(@PathVariable("empId") int empId) {
//        Optional<EmployeeEntity> getByID = employeeService.getEmployeeById(empId);
//        if (getByID.isPresent()) {
//            return new ResponseEntity<>(getByID.get(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>("ID NOT FOUND", HttpStatus.NOT_FOUND);
//        }
//    }

    //using or else

    @GetMapping("/getEmployee/{empId}")
    public ResponseEntity<?> getEmployeeById(@PathVariable("empId") int empId) {
        Optional<EmployeeEntity> getByID = employeeService.getEmployeeById(empId);

        return getByID
                .map(employeeEntity -> Optional.ofNullable(employeeEntity.getName())
                        .map(name -> new ResponseEntity<>(employeeEntity, HttpStatus.ACCEPTED))
                        .orElseThrow(BusinessException::new))
                .orElseThrow(()->new RuntimeException("NAME IS EMPTY"));
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