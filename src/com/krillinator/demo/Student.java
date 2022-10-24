package com.krillinator.demo;

public class Student {

    public int age;
    public int personNumber;

    public Student(int age, int personNumber) {
        this.age = age;
        this.personNumber = personNumber;
    }

    public void printDetails() {
        System.out.println("Hello, my age is " + age + " and my number is " + personNumber + ". This is the end.");
    }
}
