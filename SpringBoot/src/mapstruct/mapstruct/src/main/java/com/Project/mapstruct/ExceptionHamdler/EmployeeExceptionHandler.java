package com.Project.mapstruct.ExceptionHamdler;


import com.Project.mapstruct.dto.EmployeeDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.ErrorManager;

@ControllerAdvice
public class EmployeeExceptionHandler {

@ResponseStatus(HttpStatus.BAD_REQUEST)
@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object>methodHandleException(MethodArgumentNotValidException methodArgumentNotValidException){
    Map<String,String> exception=new HashMap<>();
    methodArgumentNotValidException.getBindingResult().getAllErrors().forEach((error)->{
    String fieldName=((FieldError) error).getField();
    String errorMessage=error.getDefaultMessage();
    exception.put(fieldName,errorMessage);
    });
    return new ResponseEntity<Object>(exception,HttpStatus.BAD_REQUEST);
    }

}

