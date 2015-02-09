package com.codiodes.prople.Model;

/**
 * Created by Salman on 2/7/2015.
 */
public class User {
    public String id;
    public int userType;
    public String name;
    public String email;
    public String phone;
    public String password;
    public String activated;

    public String getId() {
        return id;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActivated() {
        return activated;
    }
}
