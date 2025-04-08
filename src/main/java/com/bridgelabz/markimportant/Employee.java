package com.bridgelabz.markimportant;

public class Employee {

    private String name;
    private int age;

    @ImportantMethod(level = "NORMAL")
    void displayEmployee(){
        System.out.println("Employee name is " + name);
        System.out.println("Employee age is " + age);
    }

    @ImportantMethod
    void addDetails(String name, int age){
        this.name = name;
        this.age = age;
    }

    int getAge() {
        return age;
    }
}
