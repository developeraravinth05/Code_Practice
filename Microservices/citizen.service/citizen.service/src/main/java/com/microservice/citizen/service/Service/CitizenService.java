package com.microservice.citizen.service.Service;

import com.microservice.citizen.service.Entity.CitizenEntity;

import java.util.List;

public interface CitizenService {
    CitizenEntity createCitizen(CitizenEntity citizen);

    List<CitizenEntity> getAllCitizen();

    CitizenEntity getCitizenByID(Integer citizenId);

    void deleteByID(Integer citizenId);

    CitizenEntity updateCitizen(CitizenEntity citizen);
}
