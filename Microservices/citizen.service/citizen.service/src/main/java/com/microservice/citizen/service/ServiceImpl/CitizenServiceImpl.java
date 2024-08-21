package com.microservice.citizen.service.ServiceImpl;

import com.microservice.citizen.service.Entity.CitizenEntity;
import com.microservice.citizen.service.Repository.CitizenRepository;
import com.microservice.citizen.service.Service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenServiceImpl implements CitizenService {
@Autowired
    CitizenRepository citizenRepository;

    @Override
    public CitizenEntity createCitizen(CitizenEntity citizen) {
        CitizenEntity saveCitizen= citizenRepository.save(citizen);
        return saveCitizen;
    }

    @Override
    public List<CitizenEntity> getAllCitizen() {
        List<CitizenEntity> getAllCitizen= citizenRepository.findAll();
        return getAllCitizen;
    }

    @Override
    public CitizenEntity getCitizenByID(Integer citizenId) {
        CitizenEntity getByID=citizenRepository.findById(citizenId).get();
        return getByID ;
    }

    @Override
    public void deleteByID(Integer citizenId) {
        citizenRepository.deleteById(citizenId);
    }

    @Override
    public CitizenEntity updateCitizen(CitizenEntity citizen) {
        CitizenEntity updateCitizen=citizenRepository.save(citizen);
        return updateCitizen;
    }
}
