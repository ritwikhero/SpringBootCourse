package com.example.SpringBootFirst.repo;

import com.example.SpringBootFirst.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save (Laptop lap){
        System.out.println("Saved to DB...");
    }
}
