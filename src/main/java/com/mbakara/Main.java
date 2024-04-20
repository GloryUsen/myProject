package com.mbakara;

// Import statements
/**
 * These import statements are the necessary classes and interfaces created which are custom classes, relative to
      managing car, booking and user classes.
 * Custom classes enables developers to create objects (ENCAPSULATES) with specific attributes and behaviours as methods
      making it easier to manage complex applications by breaking them down into more manageable code.
 */

import com.mbakara.Entity.Bookings;
import com.mbakara.Entity.Car;
import com.mbakara.Entity.User;
import com.mbakara.Repository.BookingRepository;
import com.mbakara.Repository.CarRepository;
import com.mbakara.Repository.UserRepository;

import java.util.List;
import java.util.Scanner;

    public class Main {  // This main class is where the execution of the code begins.

        public static void main(String[] args) {
            CarRepository carRepository = new CarRepository(); //creating a carRepository instance.

            /**
             * Three diff cars are instantiated here with their attributes.
             */
            Car car1 = new Car(3, "Toyota", "Blue", "Camry", "SUV");
            Car car2 = new Car(5, "Honda", "White", "Honda City", "SUV");
            Car car3 = new Car(7, "Ford", "Black", "Edge", "Golf");


            /**
             * The Three attributed cars are added here
             */
            carRepository.addCar(car1);
            carRepository.addCar(car2);
            carRepository.addCar(car3);


            /**
             * BookingRepo is created.
             * Three booking objects instantiated with some attributes,
             * Then added to the bookingRepo.
             */

            BookingRepository bookingRepository = new BookingRepository();
            Scanner scanner = new Scanner(System.in);

            Bookings Car1 = new Bookings("lodge", "lodge", "Toyota", 2024, "Camry");
            Bookings Car2 = new Bookings("park", "park", "Toyota", 1024, "Golf");
            Bookings Car3 = new Bookings("space", "space", "Toyota", 3024, "Camry");

            bookingRepository.addBooking(Car1);
            bookingRepository.addBooking(Car2);
            bookingRepository.addBooking(Car3);

            /**
             * while is created which runs indefinitely until the user chose to exit the program.
             * A WhileLoop is an infinite loop in programming,which has no end, it runs repeatedly until the user chooses
             to exit the program.
             breaks out of it. that's a BREAK.
             SWITCH STATEMENT:
             * The Loop begins its execution by checking the condition specified in the "WHILE statement" e.g True.
             * The code block inside the loop is executed, this execution will continue until the user introduces a choice
             which is SCANNER. based on the user choice, the program performs diff actions like "displaying cars, removing
             cars, adding a bookingCar".
             * Option 5 is the exit case, when a user chooses this option,the loop is terminated using the return statement.
             when the user selects the Exit option, the scanner object is closed to release any resources.
             */
            while (true) {
                System.out.println("Choose an option:");
                System.out.println("1. View all cars");
                System.out.println("2. Remove a car");
                System.out.println("3. View all bookings");
                System.out.println("4. Add Booking");
                System.out.println("5. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume new line character.

                switch (choice) {
                    case 1:
                        List<Car> allCars = carRepository.getAllCars();
                        displayCars(allCars);
                        break;
                    case 2:
                        System.out.println("Enter the Car ID to remove:");
                        int carIdToRemove = scanner.nextInt();
                        Car carToRemove = (Car) carRepository.getCarById(carIdToRemove);
                        if (carToRemove != null) {
                            carRepository.removeCar(carToRemove);
                            System.out.println("Car removed successfully.");
                        } else {
                            System.out.println("Car not found.");
                        }
                        break;
                    case 3:
                        List<Bookings> bookingList = bookingRepository.getAllBookings();
                        displayBookings(bookingList);
                        break;
                    case 4:
                        System.out.println("Enter Pick-up Location");
                        String pickUpLocation = scanner.nextLine();

                        System.out.println("Enter Drop-off Location");
                        String dropOffLocation = scanner.nextLine();

                        System.out.println("Enter Car Type");
                        String carType = scanner.nextLine();

                        System.out.println("Enter Booking Year");
                        int bookingYear = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Enter carModel");
                        String carModel = scanner.nextLine();

                        Bookings newBooking = new Bookings(pickUpLocation, dropOffLocation, carType, bookingYear, carModel);
                        bookingRepository.addBooking(newBooking);
                        System.out.println("Booking Added Successfully.");
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }

        private static void displayCars(List<Car> cars) { //This si a method that displays list of cars
            if (cars.isEmpty()) { // this line checks if the cars are available or not, return True. which is
                System.out.println("No cars available"); // No cars available.
                return;// it means no car is available for booking.
            }

            /**
             * But if there are cars available, the method go through all the cars by printing out their info,for each cars
             * ID, TYPE, COLOR, MODEL and BRAND. by using forEach-Loop.
             */
            for (Car car : cars) {
                System.out.println("ID: " + car.getId() + ", Type: " + car.getCarType() + ", Color: " + car.getCarColor() +
                        ", Model: " + car.getCarModel() + ", Brand: " + car.getCarBrand());
            }
            System.out.println(); // after displaying all the cars, it prints an empty line for readability seek.
        }

        private static void displayBookings(List<Bookings> bookings) { // same process here.
            if (bookings.isEmpty()) {
                System.out.println("No bookings available.");
                return;
            }
            for (Bookings booking : bookings) {
                System.out.println("CarLoge: " + booking.getPickUpLocation());
                System.out.println("carPark: " + booking.getDropOffLocation());
                System.out.println("Car Type: " + booking.getCarType());
                System.out.println("Id: " + booking.getBookingId() + ", Model: " + booking.getCarModel());
                System.out.println("-------------------");
            }
        }


        UserRepository userRepository = new UserRepository();
        Scanner scanner = new Scanner(System.in);

        {
            System.out.println("Choose an option:");
            System.out.println("1. View all users");
            System.out.println("2. Add a new user");
            System.out.println("3. Exit");


            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline


            switch (choice) {
                case 1:
                    List<User> allUsers = userRepository.getAllUsers();
                    displayUsers(allUsers);
                    break;
                case 2:
                    System.out.println("Enter User ID:");
                    String userId = scanner.nextLine();

                    System.out.println("Enter Username:");
                    String username = scanner.nextLine();

                    System.out.println("Enter Email:");
                    String email = scanner.nextLine();

                    userRepository.addUser(new User(userId, username, email));
                    System.out.println("User added successfully.");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }


        private static void displayUsers(List<User> users) {
            if (users.isEmpty()) {
                System.out.println("No users available");
                return;
            }
            for (User user : users) {
                System.out.println("User ID: " + user.getUserId() + ", Username: " + user.getUserName()
                        + ", Email: " + user.getUserEmail());
            }
            System.out.println();
        }
    }























