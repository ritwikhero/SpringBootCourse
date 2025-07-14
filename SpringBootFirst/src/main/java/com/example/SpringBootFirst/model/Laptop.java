package com.example.SpringBootFirst.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Laptop")
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compiling in Laptop....");
    }
}
