package org.example;

public class Alien {

    private int age ;

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
    }
}
