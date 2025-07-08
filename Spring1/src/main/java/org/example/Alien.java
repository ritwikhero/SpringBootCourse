package org.example;

import java.beans.ConstructorProperties;

public class Alien {

    private int age ;
    private int salary;

    @ConstructorProperties({"age", "salary", "lap" })
    public Alien(int age, int salary, Laptop lap) {
        this.age = age;
        this.salary = salary;
        this.lap = lap;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
//    public Alien(int age, Laptop lap) {
//        this.age = age;
//        this.lap = lap;
//    }

    private Laptop lap;

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien(){
        System.out.println("object created");
    }

    public void code(){
        System.out.println("Coding....");
        lap.complie();
    }
}
