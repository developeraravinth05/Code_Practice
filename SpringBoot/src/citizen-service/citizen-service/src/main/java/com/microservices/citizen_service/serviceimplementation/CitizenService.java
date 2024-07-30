package com.microservices.citizen_service.serviceimplementation;

import com.microservices.citizen_service.entity.Citizen;

import java.util.List;

public interface CitizenService {
    public Citizen createEmployee(Citizen citizen);

    Citizen getEmployee(Integer citizenId);


    List<Citizen> getAllEmployee();
}
