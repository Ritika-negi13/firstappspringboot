package com.myapp.demo.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//component scanning for explicit or custom packages outside main
//@SpringBootApplication(
//  scanBasePackages = { "com.myapp.demo.firstapp"}
//		// no need to add base package
// )
//explicity list base packages
public class FirstappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstappApplication.class, args);
	}

}
