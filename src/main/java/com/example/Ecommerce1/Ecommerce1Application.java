package com.example.Ecommerce1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ecommerce1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ecommerce1Application.class, args);
	}


	@GetMapping("/")
	public String getName(){
		return "Hello World";
	}

}
