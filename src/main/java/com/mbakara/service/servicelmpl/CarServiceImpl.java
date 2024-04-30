package com.mbakara.service.servicelmpl;

import com.mbakara.Entity.Car;
import com.mbakara.Repository.CarRepository;
import com.mbakara.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {

    CarRepository carRepository = new CarRepository();

    @Override
    public List<Car> getAllCars() {
        return null;
    }

    @Override
    public Car getCarById(Long id) {
        return CarRepository.cars.get(2);
    }

    @Override
    public void addCar(Car car) {
        carRepository.addCar(car);

    }

    @Override
    public void removeCar(Car car) {
        int carIdToRemove = 1;
        Car carToRemove = (Car) carRepository.getCarById(carIdToRemove);
        if (carToRemove != null) {
            carRepository.removeCar(carToRemove);
        }
    }
}

