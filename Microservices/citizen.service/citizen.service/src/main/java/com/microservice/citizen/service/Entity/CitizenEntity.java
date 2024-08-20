package com.microservice.citizen.service.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Citizen")
public class CitizenEntity {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private int id;

@Column(columnDefinition = "CitizenName")
private String name;

@Column
private int vaccinationCenterID;
}
