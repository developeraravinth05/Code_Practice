package com.Project.mapstruct.Validators;

import com.Project.mapstruct.repositroy.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



public class UniqueEmailValidation implements ConstraintValidator<UniqueEmailValidator,String> {
    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
       if (employeeRepository.findByEmail(value).isEmpty()){
       return true;
       }else
       return false;
    }
}
