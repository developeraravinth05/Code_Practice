package com.AOP.Project_AOP.Advice;


import com.AOP.Project_AOP.Entity.Employee;
import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;


@Aspect
@Component
public class EmployeeAdvice {


    @Before(value = "execution(* com.AOP.Project_AOP.Contoller.EmployeeController.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {

        System.out.println("BEFORE ADVICE IS ACTIVATED" + joinPoint.getSignature() + LocalDate.now());

    }

    @After(value = "execution(* com.AOP.Project_AOP.Contoller.EmployeeController.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("AFTER ADVICE IS ACTIVATED" + joinPoint.getSignature() + " " + LocalDate.now());

    }


    @AfterReturning(
            value = "execution(* com.AOP.Project_AOP.Service.EmployeeServiceImpl.*(..))",
            returning = "employee"
    )
    public void afterReturn(JoinPoint joinPoint, Employee employee) {
        if (employee != null) {
            System.out.println("AFTER RETURN ADVICE IS ACTIVATED " + joinPoint.getSignature() + " " + LocalDate.now() + " Employee ID: " + employee.getId());
        } else {
            System.out.println("AFTER RETURN ADVICE IS ACTIVATED " + joinPoint.getSignature() + " " + LocalDate.now() + " No Employee returned");
        }
    }

    @AfterThrowing(
            value = "execution(* com.AOP.Project_AOP.Service.EmployeeServiceImpl.*(..))",
            throwing = "exception"
    )
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {

        System.out.println("AFTER thrown ADVICE IS ACTIVATED " + joinPoint.getSignature() + " " + LocalDate.now() + " Exception: " + exception.getMessage());
    }


    @Around(value = "execution(* com.AOP.Project_AOP.Service.EmployeeServiceImpl.createEmployee(..))",argNames ="int")
    public Employee aroundMethod(ProceedingJoinPoint joinPoint) {
        System.out.println("Success started");
        try {
            Employee[] employees=new Employee[1];


            Employee employee=new Employee();
            employee.setName("ramu");
            employees[0]=employee;
           joinPoint.proceed();
           return employee;
        } catch (Throwable e) {
            // Log the exception or handle it
            e.printStackTrace();
        }

        System.out.println("Success Around");
return null;
    }



}
