package com.mbakara.Repository;

    // Defining the bookingCar class

import com.mbakara.Entity.Bookings;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository {

    private List<Bookings> bookings;

    public BookingRepository(){
        this.bookings = new ArrayList<>();

    }
    public void addBooking(Bookings booking){
        this.bookings.add(booking);
    }

   public List<Bookings> getAllBookings(){
        return this.bookings;
   }

   public void removeBooking(){
        bookings.remove();
   }


}
