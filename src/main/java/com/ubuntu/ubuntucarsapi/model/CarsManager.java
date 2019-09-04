package com.ubuntu.ubuntucarsapi.model;

import com.ubuntu.ubuntucarsapi.model.dao.CarsRepository;
import com.ubuntu.ubuntucarsapi.model.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarsManager implements CarsService {

    @Autowired
    CarsRepository carsRepository;

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        carsRepository.findAll().forEach(cars::add);
        return cars;
    }

}
