package com.mbakara.service;

import com.mbakara.Entity.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();
    Car getCarById(long id);

    void addCar(Car car);
    void removeCar(Car car);
}
