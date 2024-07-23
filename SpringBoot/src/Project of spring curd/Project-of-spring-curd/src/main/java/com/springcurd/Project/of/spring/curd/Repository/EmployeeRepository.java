package com.springcurd.Project.of.spring.curd.Repository;

import com.springcurd.Project.of.spring.curd.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer> {


}
