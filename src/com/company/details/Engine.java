package com.company.details;

public class Engine {

    private double enginePower;
    private String producer;

    public Engine() {
    }

    public Engine(double enginePower, String producer) {
        this.enginePower = enginePower;
        this.producer = producer;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


}
