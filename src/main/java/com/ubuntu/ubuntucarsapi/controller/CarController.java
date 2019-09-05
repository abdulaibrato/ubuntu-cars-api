package com.ubuntu.ubuntucarsapi.controller;

import com.ubuntu.ubuntucarsapi.domain.Car;
import com.ubuntu.ubuntucarsapi.service.CarService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CarController {
   
    private CarService carService;

    private CarController(CarService carService) {
        this.carService = carService;
        }

 }
    
