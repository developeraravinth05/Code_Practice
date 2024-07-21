package com.Project.mapstruct.populator;

import com.Project.mapstruct.Entity.EmployeeEntity;
import com.Project.mapstruct.dto.EmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeePopulator {

    EmployeePopulator INSTANCE= Mappers.getMapper(EmployeePopulator.class);


@Mapping(target = "creationDate",ignore = true)
@Mapping(target = "id",ignore = true)
    EmployeeEntity employeeMapper(EmployeeDto employeeDto);
}
