package com.mbakara;

public class Booking {
    private String pickUpLocation;
    private String dropOffLocation;
    private String type;
    private int bookingId;
    private String carModel;

    public Booking(String pickUpLocation, String dropOffLocation, String type, int bookingId, String carModel) {
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
        this.type = type;
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
        return type;
    }

    public void setCarType(String carType) {
        this.type = carType;
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

    @Override
    public String toString() {
        return "Booking{" +
                "pickUpLocation='" + pickUpLocation + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                ", carType='" + type + '\'' +
                ", bookingId=" + bookingId +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}
