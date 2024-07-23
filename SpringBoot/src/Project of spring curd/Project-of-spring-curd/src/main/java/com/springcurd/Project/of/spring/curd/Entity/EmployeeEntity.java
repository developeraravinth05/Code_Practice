package com.springcurd.Project.of.spring.curd.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(catalog = "Employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Long age;

}
