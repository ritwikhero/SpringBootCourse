package org.example;

public class Laptop implements Computer {
//    public Laptop(){
//        System.out.println("Laptop created");
//    }

    @Override
    public void complie(){
        System.out.println("Compling using laptop");
    }
}
