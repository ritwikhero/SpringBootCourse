package com.example.SpringBootFirst;

import com.example.SpringBootFirst.model.Alien;
import com.example.SpringBootFirst.model.Laptop;
import com.example.SpringBootFirst.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootFirstApplication.class, args);

		LaptopService service = applicationContext.getBean(LaptopService.class);

		Laptop lap = applicationContext.getBean(Laptop.class);

		service.addLaptop(lap);

//		Alien a1 = applicationContext.getBean(Alien.class);
//		a1.code();

	}

}
