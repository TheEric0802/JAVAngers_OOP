package org.example;

public class Car {

    private String brand;
    private String model;
    private int year;
    private String color;

    private boolean motorRunning;
    private int speed;

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.motorRunning = false;
        this.speed = 0;
    }

    public void startMotor() {
        this.motorRunning = true;
        System.out.println("Motor started");
    }

    public void accelerate() {
        if (this.motorRunning) {
            this.speed += 10;
        } else {
            System.out.println("Start the motor first");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public boolean isMotorRunning() {
        return motorRunning;
    }

    public int getSpeed() {
        return speed;
    }
}
