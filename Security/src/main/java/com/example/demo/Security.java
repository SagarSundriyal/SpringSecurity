package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Security {

public static void main(String[] args) {
		
		SpringApplication.run(Security.class, args);
		String retrievedStoredPassword = "ss";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		System.out.println("passwordEncoder "+passwordEncoder);
		String encodedPassword = passwordEncoder.encode(retrievedStoredPassword);
		System.out.println("encodedPassword "+encodedPassword);
		
		
		String userEnteredPassword = "ss";
		System.out.println("userEnteredPassword "+userEnteredPassword);
		//String retrievedStoredPassword = "retrieved_password_from_database";

		//BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		if (passwordEncoder.matches(userEnteredPassword, retrievedStoredPassword)) {
		    // Passwords match
			System.out.println("password match");
		} else {
		    // Passwords do not match
			System.out.println("password do not match");
		}
  }
}
