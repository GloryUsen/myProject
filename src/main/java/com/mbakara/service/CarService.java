package com.mbakara.service;

import com.mbakara.Entity.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();
    Car getCarById(int id);

    void addCar(Car car);
    void removeCar(Car car);
}
