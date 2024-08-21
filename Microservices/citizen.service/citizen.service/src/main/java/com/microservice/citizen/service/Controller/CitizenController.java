package com.microservice.citizen.service.Controller;


import com.microservice.citizen.service.Entity.CitizenEntity;
import com.microservice.citizen.service.Service.CitizenService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

    @Autowired
    CitizenService citizenService;

    @PostMapping("/save")
    public ResponseEntity<CitizenEntity> createEmployee(@RequestBody CitizenEntity citizen) {
        CitizenEntity saveCitizen = citizenService.createCitizen(citizen);
        return new ResponseEntity<>(saveCitizen, HttpStatus.CREATED);

    }
@GetMapping("/all")
    public ResponseEntity<List<CitizenEntity>> getAllCitizen(){
List<CitizenEntity> getAllCitizen= citizenService.getAllCitizen();
return new ResponseEntity<>(getAllCitizen,HttpStatus.OK);

}

@GetMapping("/citizen{id}")
    public ResponseEntity<CitizenEntity>getCitizenById(@PathVariable("id") Integer citizenId){
CitizenEntity getByID=citizenService.getCitizenByID(citizenId);
return new ResponseEntity<>(getByID,HttpStatus.OK);

}

@DeleteMapping("/delete{id}")
    public ResponseEntity<Void>deleteCitizenById(@PathVariable("id")Integer citizenId){
          citizenService.deleteByID(citizenId);
    return  new ResponseEntity<Void>(HttpStatus.ACCEPTED);

    }

    @PutMapping("/update")
    public ResponseEntity<CitizenEntity> updateCitizen(@RequestBody CitizenEntity citizen){
    CitizenEntity updateCitizen=citizenService.updateCitizen(citizen);
    return new ResponseEntity<>(updateCitizen,HttpStatus.ACCEPTED);
    }
}
