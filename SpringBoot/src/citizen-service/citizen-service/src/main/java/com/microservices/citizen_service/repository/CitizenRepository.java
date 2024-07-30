package com.microservices.citizen_service.repository;


import com.microservices.citizen_service.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen,Integer> {


}
