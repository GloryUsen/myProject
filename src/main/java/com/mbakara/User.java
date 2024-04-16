package com.mbakara;

public class User {
    private String userName;
    private String userId;
    private String address;

    public User(String userName, String userId, String address) {
        this.userName = userName;
        this.userId = userId;
        this.address = address ;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
       return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                ", address ='" + address + '\'' +
                '}';
    }
}
