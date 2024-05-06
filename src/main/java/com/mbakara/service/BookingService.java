package com.mbakara.service;

import com.mbakara.Entity.Bookings;

import java.util.List;

public interface BookingService {

    List<Bookings> getAllBooking();
    void addBookings();
    void removeBooking(Bookings bookings);
}
