package com.mbakara.Repository;

    // Defining the bookingCar class

import com.mbakara.Entity.Bookings;


import java.util.ArrayList;
import java.util.List;

public class BookingRepository {

    private List<Bookings> booking;

    public BookingRepository(){
        this.booking = new ArrayList<>();

    }
    public void addBooking(Bookings booking){
        this.booking.add(booking);
    }

   public List<Bookings> getAllBookings(){
        return this.booking;
   }

   public void removeBooking(Bookings bookings){
        booking.remove(bookings);
   }


}
