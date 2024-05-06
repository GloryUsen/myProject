package com.mbakara.service.servicelmpl;

import com.mbakara.Entity.Car;
import com.mbakara.Repository.CarRepository;
import com.mbakara.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {

    CarRepository carRepository = new CarRepository();

    @Override
    public List<Car> getAllCars() {
        return carRepository.getAllCars();
    }

    @Override
    public Car getCarById(int id) {
        return (Car) carRepository.getCarById(id);
    }

    @Override
    public void addCar(Car car) {
        carRepository.addCar(car);

    }
    @Override
    public void removeCar(Car car) {
        int carIdToRemove = (int)car.getId();
        Car carToRemove = carRepository.getCarById(carIdToRemove);
        if (carToRemove != null) {
            carRepository.removeCar(carToRemove);
        }
    }

}






