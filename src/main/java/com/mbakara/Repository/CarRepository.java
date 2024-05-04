package com.mbakara.Repository;

import com.mbakara.Entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    public static List<Car> cars;                      // defining the repository class to hold the car obj.
    public CarRepository(){
        cars = new ArrayList<>();                   // does not take any parameter (it initialised the list of cars)
    }

    /**
     * Method to add a car to the repository
     */

    public boolean addCar(Car car){

        return cars.add(car);  // adding a car
    }

    /**
     * method to get all cars in the repository
     */
    public  List<Car> getAllCars(){

        return cars;
    }

    public List<Car> getCarById(Long carIdToRemove){

        return getCarById(carIdToRemove);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }
}
