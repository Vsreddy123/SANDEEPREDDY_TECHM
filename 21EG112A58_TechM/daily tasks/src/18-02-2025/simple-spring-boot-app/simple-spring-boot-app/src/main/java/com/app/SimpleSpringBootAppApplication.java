package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringBootAppApplication.class, args);
		System.out.println("Hi My first SpringBoot application");
	}

}
