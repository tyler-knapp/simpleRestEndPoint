package com.philodelight.model;

public class User {
    
    String firstName;
    String lastName;
    double id;
    
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public double getId() {
        return id;
    }
    
    public void setId(double id) {
        this.id = id;
    }
}
