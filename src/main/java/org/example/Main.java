package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "3 Series", 2012, "Black");
        car.startMotor();

        Car car2 = new Car("BMW", "3 Series", 2012, "White");
        car2.startMotor();
        car2.accelerate();
        System.out.println(car2.getSpeed());

        new Person("John", "Doe", 30, "Male").introduce();
        new Person("Jane", "Doe", 25, "Female").introduce();
        new Person("Max", "Mustermann", 25, "Male").introduce();

    }
}