package com.mbakara;

// demonstrating the usage of adding and retrieving car.

import com.mbakara.Repository.BookingRepository;
import com.mbakara.Repository.CarRepository;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository(); //creating a repository instance.

        carRepository.addCar(new Car("Toyota", "Blue", "Camry", "SUV"));
        carRepository.addCar(new Car("Honda", "White", "Honda City", "SUV"));
        carRepository.addCar(new Car("Ford", "Black", "Edge", "Golf"));

        List<Car> allCars = CarRepository.getAllCars(); // retrieving cars from the repository
        for (Car car : allCars) {
            System.out.println("Type: " + car.getCarType() + " Color: " + car.getCarColor() + " model: " + car.getCarModel()
                    + " brand: " + car.getCarBrand());
        }

        BookingRepository bookingRepository = new BookingRepository();

        bookingRepository.addBookingRepository(new Booking("carLoge", "Garage", "Toyota", 2024, "Toyota Camry"));
        bookingRepository.addBookingRepository(new Booking("wareHouse", "wareHouse", "Honda", 2024, "Honda City"));
        bookingRepository.addBookingRepository(new Booking("Park", "Park", "Ford",  2024, "Edge"));

        List<Booking> bookingList = bookingRepository.getAllBookings(); // getting all the booking cars from the repo

        for (Booking booking : bookingList){
            System.out.println("CarLoge: "+ booking.getPickUpLocation() + "carPark: " + booking.getDropOffLocation()+  ": " + booking.getCarType()
            + "Id: " + booking.getBookingId()+ "Model: " + booking.getCarModel());
        }





    }
}
//}