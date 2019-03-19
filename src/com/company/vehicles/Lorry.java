package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    double bodyCapacity;

    public Lorry() {
    }

    public Lorry(double bodyCapacity) {
        this.bodyCapacity = bodyCapacity;
    }

    public Lorry(String carModel, String carClass, double weight, Driver driver, Engine engine, double bodyCapacity) {
        super(carModel, carClass, weight, driver, engine);
        this.bodyCapacity = bodyCapacity;
    }

    public double getBodyCapacity() {
        return bodyCapacity;
    }

    public void setBodyCapacity(double bodyCapacity) {
        this.bodyCapacity = bodyCapacity;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Грузоподъемность кузова: " + bodyCapacity);
    }
}
