package com.Project.mapstruct.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
public class EmployeeDto {

    private int id;
    private String name;
    private String department;
    private int age;

}
