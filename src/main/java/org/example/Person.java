package org.example;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.firstName + " " + this.lastName + ", a " + this.age + " year old " + this.gender);
    }
}
