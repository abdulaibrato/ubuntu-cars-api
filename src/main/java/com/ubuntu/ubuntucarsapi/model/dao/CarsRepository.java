package com.ubuntu.ubuntucarsapi.model.dao;

import com.ubuntu.ubuntucarsapi.model.domain.Car;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CarsRepository extends PagingAndSortingRepository<Car, Integer> {}
