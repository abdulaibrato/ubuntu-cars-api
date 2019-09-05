package com.ubuntu.ubuntucarsapi.repository;

import com.ubuntu.ubuntucarsapi.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
}
