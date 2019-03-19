package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar() {
    }

    public SportCar(double speed) {
        this.speed = speed;
    }

    public SportCar(String carModel, String carClass, double weight, Driver driver, Engine engine, double speed) {
        super(carModel, carClass, weight, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Скорость: " + speed);
    }
}
