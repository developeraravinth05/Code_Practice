package com.Project.mapstruct.dto;

import com.Project.mapstruct.Validators.UniqueEmailValidator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@Data
@Builder
public class EmployeeDto {

    private int id;
    @NotBlank(message = "Name should not be blank")
    private String name;
    private String department;
    @Email
    @NotBlank(message = "Email should not be blank")
    @UniqueEmailValidator(message="Email is not unique")
    private String email;
    @Min(message = "Min age should be above 20", value = 20)
    @Max(message ="Max age should be below 60",value = 60)
    private int age;

}
