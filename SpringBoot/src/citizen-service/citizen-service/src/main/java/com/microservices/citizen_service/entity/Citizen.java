package com.microservices.citizen_service.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "citizen")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Citizen {


@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private int vaccinationCenter;

}
