package com.mbakara.service.servicelmpl;

import com.mbakara.Entity.Bookings;
import com.mbakara.Entity.Car;
import com.mbakara.Repository.BookingRepository;
import com.mbakara.service.BookingService;

import java.util.List;

public class BookingServiceImpl implements BookingService {

    BookingRepository bookingRepository = new BookingRepository();
    @Override
    public List<Bookings> getAllBooking() {
        return bookingRepository.getAllBookings();
    }

    @Override
    public void addBookings() {
        bookingRepository.addBooking(null); // should I add a new booking here or make it null, if booking is not avail
        //able.

    }

    @Override
    public void removeBooking() {
        bookingRepository.removeBooking();

    }
}
