package com.mbakara.Repository;

import com.mbakara.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private static List<Car> cars; // defining the repository class to hold the car obj.

    public CarRepository(List<Car> cars) { // This constructor takes an existing list(taking parameter of type car).
        this.cars = cars;
    }

    public CarRepository(){
        cars = new ArrayList<>();// does not take any parameter (it initialised the list of cars)
    }

    /**
     * Method to add a car to the repository
     */

    public void addCar(Car car){
        cars.add(car);  // adding a car
    }

    /**
     * method to get all cars in the repository
     */
    public static List<Car> getAllCars(){
        return cars;
    }
}
