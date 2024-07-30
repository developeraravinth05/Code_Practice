package com.microservices.citizen_service.controller;


import com.microservices.citizen_service.entity.Citizen;
import com.microservices.citizen_service.serviceimplementation.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

@Autowired
    CitizenService citizenService;

@PostMapping("/add")
    public ResponseEntity<Citizen> createEmployee (@RequestBody Citizen citizen){
   Citizen addCitizen= citizenService.createEmployee(citizen);
   return new ResponseEntity<>(addCitizen, HttpStatus.CREATED);
}

    @GetMapping("/get/{citizenId}")
    public ResponseEntity<Citizen>getEmployee (@PathVariable("citizenId") Integer citizenId){
        Citizen addCitizen= citizenService.getEmployee(citizenId);
        return new ResponseEntity<>(addCitizen, HttpStatus.OK);
    }
    @GetMapping("/get")
    public ResponseEntity<List<Citizen>>getAllEmployee (){
        List<Citizen> addAllCitizen= citizenService.getAllEmployee();
        return new ResponseEntity<>(addAllCitizen, HttpStatus.OK);
    }


}
