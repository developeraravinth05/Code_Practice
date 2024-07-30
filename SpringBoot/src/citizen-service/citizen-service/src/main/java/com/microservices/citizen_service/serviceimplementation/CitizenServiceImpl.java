package com.microservices.citizen_service.serviceimplementation;

import com.microservices.citizen_service.entity.Citizen;
import com.microservices.citizen_service.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenServiceImpl implements CitizenService {

    @Autowired
    CitizenRepository citizenRepository;


    @Override
    public Citizen createEmployee(Citizen citizen) {
        return citizenRepository.save(citizen);
    }

    @Override
    public Citizen getEmployee(Integer citizenId) {
        return citizenRepository.findById(citizenId).get();
    }

    @Override
    public List<Citizen> getAllEmployee() {
        return citizenRepository.findAll();
    }
}
