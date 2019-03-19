package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String carModel;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car() {
    }

    public Car(String carModel, String carClass, double weight, Driver driver, Engine engine) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public void printInfo(){
        System.out.println("Модель автомобиля: " + carModel  + "; Класс автомобиля: " + carClass  + "; Вес автомобиля: " + weight);
        System.out.println("Имя водителя: " + driver.getFullName() + "; Опыт водителя: " + driver.getDriverExperience());
        System.out.println("Мощность двигателя: " + engine.getEnginePower() + "; Производитель двигателя: " + engine.getProducer());
    }
}
