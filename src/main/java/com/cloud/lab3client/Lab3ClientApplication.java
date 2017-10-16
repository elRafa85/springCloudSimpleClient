package com.cloud.lab3client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab3ClientApplication {

	//Run this on localhost 8002, and go to the url defined on the controller.
	public static void main(String[] args) {
		SpringApplication.run(Lab3ClientApplication.class, args);
	}
}
