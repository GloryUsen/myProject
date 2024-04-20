package com.mbakara.Entity;

public class User {
    private String userName;
    private String userId;
    private String email;

    public User(String userName, String userId, String email) {
        this.userName = userName;
        this.userId = userId;
        this.email = email ;
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

    public String getUserEmail() {
        return email;
    }

    public void setUserEmail() {
        this.email = getUserEmail();
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                ", email ='" + email + '\'' +
                '}';
    }

}
