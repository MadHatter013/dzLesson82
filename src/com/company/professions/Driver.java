package com.company.professions;

public class Driver extends Person {
    private double driverExperience;

    public Driver() {
    }

    public Driver(String fullName, double driverExperience) {
        super(fullName);
        this.driverExperience = driverExperience;
    }

    public double getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(double driverExperience) {
        this.driverExperience = driverExperience;
    }


}
