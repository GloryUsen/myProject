package com.mbakara.Entity;

public class Bookings {
    private String pickUpLocation;
    private String dropOffLocation;
    private String carType;
    private int bookingId;
    private String carModel;

    public Bookings(String pickUpLocation, String dropOffLocation, String carType, int bookingId, String carModel) {
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
        this.carType = carType;
        this.bookingId = bookingId;
        this.carModel = carModel;
    }



    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }


    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public boolean remove(){
        return remove();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "pickUpLocation='" + pickUpLocation + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                ", carType='" + carType + '\'' +
                ", bookingId=" + bookingId +
                ", carModel='" + carModel + '\'' +
                '}';
    }


}
