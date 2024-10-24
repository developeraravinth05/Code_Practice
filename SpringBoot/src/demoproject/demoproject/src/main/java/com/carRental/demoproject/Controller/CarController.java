package com.carRental.demoproject.Controller;


import com.carRental.demoproject.Entity.Car;
import com.carRental.demoproject.Entity.Customer;
import com.carRental.demoproject.Repository.CarRepository;
import com.carRental.demoproject.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/{carId}/rent")
    public ResponseEntity<?> rentCar(@PathVariable int carID, @RequestBody Customer customerRequest){

        Optional<Car> carOpt= carRepository.findById(carID);


    }


}
