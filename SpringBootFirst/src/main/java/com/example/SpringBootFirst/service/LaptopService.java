package com.example.SpringBootFirst.service;

import com.example.SpringBootFirst.model.Laptop;
import com.example.SpringBootFirst.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    LaptopRepository repo;
    public void addLaptop(Laptop lap) {
        repo.save(lap);
        System.out.println("laptop service method called...");
    }

    public boolean isGoodForProgramming(Laptop lap){
        return true;
    }
}
