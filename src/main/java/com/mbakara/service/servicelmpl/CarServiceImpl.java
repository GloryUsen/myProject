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
    public Car getCarById(long id) {
        return carRepository.getCarById(id);
    }

    @Override
    public void addCar(Car car) {
        carRepository.addCar(car);

    }
    @Override
    public void removeCar(Car car){
        carRepository.removeCar(car);

    }


}






