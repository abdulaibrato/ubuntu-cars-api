package com.ubuntu.ubuntucarsapi.service;

import com.ubuntu.ubuntucarsapi.domain.Car;
import com.ubuntu.ubuntucarsapi.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
    private CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;}

    @Override
    //    find car brand by id
    public Car getAllCarBrandById(int id) {
        return this.carRepository.findById(id).get();
    }

    @Override
    //    find car colour by id
    public Car findAllCarColourById(int id) {
        return this.carRepository.findById(id).get();
    }

    @Override
    //    find car price by id
    public Car findAllCarPriceById(int id) {
        return this.carRepository.findById(id).get();
    }

    @Override
//    find car model by id
    public Car findAllCarModelById(int id) {
        return this.carRepository.findById(id).get();
    }
}
