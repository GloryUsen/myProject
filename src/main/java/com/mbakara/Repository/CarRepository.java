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


    public Car getCarById(long id){ //Looking at all the cars in the parking space(In the List).
        for(Car car : cars){ // iterating on each car, if the ID matches the required car.
            if(car.getId() == id){// If it finds car with the matching ID,
                return car; //it returns That car.
            } // but if it doesn't find any car with the specific ID, after checking all the cars in the List
        }
        return null; // it returns Null.
    }

    public void removeCar(Car car){
        cars.remove(car);
    }

}
