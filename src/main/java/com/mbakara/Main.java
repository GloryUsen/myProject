package com.mbakara;

// demonstrating the usage of adding and retrieving car.

import com.mbakara.Repository.CarRepository;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository(); //creating a repository instance.

        carRepository.addCar(new Car("Toyota", "Blue", "Camry", "SUV"));
        carRepository.addCar(new Car("Honda", "White", "Honda city", "SUV"));
        carRepository.addCar(new Car("Ford", "Black", "Edge", "Golf"));

        List<Car> allCars = CarRepository.getAllCars(); // retrieving cars from the repository
        for (Car car : allCars) {
            System.out.println("Type: " + car.getCarType() + " Color: " + car.getCarColor() + " model: " + car.getCarModel()
                    + " brand: " + car.getCarBrand());
        }
    }
}
//}