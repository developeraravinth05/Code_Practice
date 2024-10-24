package com.carRental.demoproject.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Car {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String model;
private boolean available;
@ManyToMany(mappedBy = "cars",cascade = CascadeType.ALL)
private List<Customer> customers =new ArrayList<>();
}
