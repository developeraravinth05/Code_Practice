package com.microservice.citizen.service.Repository;

import com.microservice.citizen.service.Entity.CitizenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CitizenRepository extends JpaRepository<CitizenEntity,Integer> {
}
