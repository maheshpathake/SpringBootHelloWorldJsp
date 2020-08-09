package com.sampledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApp {
	public static void main(String[] args) {
		SpringApplication.run(HelloworldApp.class, args);
		System.out.println("Application Started");
		System.out.println("Hello World");

	}
}
