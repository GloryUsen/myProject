package com.mbakara;

// demonstrating the usage of adding and retrieving car.

import com.mbakara.Repository.BookingRepository;
import com.mbakara.Repository.CarRepository;
import com.mbakara.Repository.UserRepository;

import java.util.List;



public class Main {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository(); //creating a carRepository instance.

        Car car1 = new Car(3, "Toyota", "Blue", "Camry", "SUV");
        Car car2 = new Car(5, "Honda", "White", "Honda City", "SUV");
        Car car3 = new Car(7, "Ford", "Black", "Edge", "Golf");

        carRepository.addCar(car1);
        carRepository.addCar(car2);
        carRepository.addCar(car3);

        List<Car> allCars = carRepository.getAllCars(); // retrieving cars from the repository
        for (Car car : allCars) {
            System.out.println("Type: " + car.getCarType() + " Color: " + car.getCarColor() + " model: " + car.getCarModel()
                    + " brand: " + car.getCarBrand());
        }

        System.out.println();
        System.out.println();
        //Car carToRemove =
        carRepository.removeCar(car1);
        for(Car car : allCars){
            System.out.println("Type: " + car.getCarType() + " Color: " + car.getCarColor() + " model: " + car.getCarModel()
                    + " brand: " + car.getCarBrand());

        }


        BookingRepository bookingRepository = new BookingRepository(); // creating a bookingRepo instance

        Booking Car1 = new Booking("carLoge", "Garage", "Toyota", 2024, "Toyota Camry");
        Booking Car2 = new Booking("carLoge", "Garage", "Toyota", 2024, "Toyota Camry");
        Booking Car3 = new Booking("carLoge", "Garage", "Toyota", 2024, "Toyota Camry");

        bookingRepository.addBookingRepository(Car1);
        bookingRepository.addBookingRepository(Car2);
        bookingRepository.addBookingRepository(Car3);

        List<Booking> bookingList = bookingRepository.getAllBookings(); // getting all the booking cars from the repo
        for (Booking booking : bookingList){
            System.out.println("CarLoge: "+ booking.getPickUpLocation() + "carPark: " + booking.getDropOffLocation()+  ": " + booking.getCarType()
            + "Id: " + booking.getBookingId()+ "Model: " + booking.getCarModel());
        }

        UserRepository userRepository = new UserRepository();

        User User1 = new User("glory", "8989", "lagos island");
        User User2 = new User("sarah", "909", "uyo");
        User User3 = new User("covenant", "678", "uyo");

        userRepository.addUser(User1);
        userRepository.addUser(User2);
        userRepository.addUser(User3);

        List<User> userList = userRepository.getAllUsers();
        for(User user : userList){
            System.out.println("Name: " + user.getUserName() + ", Id: " + user.getUserId() + ", Address: " + user.getAddress());
        }





    }
}
//}