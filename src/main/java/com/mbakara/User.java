package com.mbakara;

public class User {
    private String userName;
    private int userId;
    private String bookCar;

    public User(String userName, int userId, String bookCar) {
        this.userName = userName;
        this.userId = userId;
        this.bookCar = bookCar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBookCar() {
        return bookCar;
    }

    public void setBookCar(String bookCar) {
        this.bookCar = bookCar;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                ", bookCar='" + bookCar + '\'' +
                '}';
    }
}
