package com.mbakara.Repository;

    // Defining the bookingCar class

import com.mbakara.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository {

    private List<Booking> bookingRepositories;

    public BookingRepository(){
        bookingRepositories = new ArrayList<>();

    }
    public void addBookingRepository(Booking booking){
        bookingRepositories.add(booking);
    }

   public List<Booking> getAllBookings(){

       return bookingRepositories;
   }







    }
