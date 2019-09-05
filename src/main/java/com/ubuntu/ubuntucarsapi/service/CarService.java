package com.ubuntu.ubuntucarsapi.service;

import com.ubuntu.ubuntucarsapi.domain.Car;

public interface CarService {
Car getAllCarBrandById(int id);
Car findAllCarColourById(int id);
Car findAllCarPriceById(int id);
Car findAllCarModelById(int id);

}
