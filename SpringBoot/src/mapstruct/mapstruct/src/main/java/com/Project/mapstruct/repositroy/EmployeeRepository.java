package com.Project.mapstruct.repositroy;


import com.Project.mapstruct.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer> {
List<EmployeeEntity>findByEmail(String emailAddress);
}
