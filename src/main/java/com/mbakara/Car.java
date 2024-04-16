package com.mbakara;

public class Car {

    private Long id;
    private String carType;
    private String carColor;
    private String carModel;
    private String carBrand;
    private boolean isBooked;




    public Car(long id, String carType, String carColor, String carModel, String carBrand) {
        this.id = id;
        this.carType = carType;
        this.carColor = carColor;
        this.carModel = carModel;
        this.carBrand = carBrand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
