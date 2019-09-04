package com.ubuntu.ubuntucarsapi.web;

import com.ubuntu.ubuntucarsapi.model.CarsService;
import com.ubuntu.ubuntucarsapi.model.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "cars")
public class CarsController {

    @Autowired
    private CarsService carsService;

    @RequestMapping(value = "all-cars")
    public @ResponseBody List<Car> getAllCars() {
        return carsService.getAllCars();
    }

}
