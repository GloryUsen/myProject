package com.mbakara;

public class Booking {
    private String carBrand;
    private User user;
    private int bookingId;
    private Car car;

    public Booking(String carBrand, User user, int bookingId, Car car) {
        this.carBrand = carBrand;
        this.user = user;
        this.bookingId = bookingId;
        this.car = car;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "carBrand='" + carBrand + '\'' +
                ", user=" + user +
                ", bookingId=" + bookingId +
                ", car=" + car +
                '}';
    }



}
