package com.Project.mapstruct.Validators;


import com.sun.istack.Interned;
import lombok.experimental.FieldDefaults;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy ={UniqueEmailValidation.class})
public @interface  UniqueEmailValidator {

//errorMessage
public String message() default "Email Address must be unique";
//groups
    Class<?>[] groups() default {};
    //payload
    Class<? extends Payload>[] payload() default {};
}
