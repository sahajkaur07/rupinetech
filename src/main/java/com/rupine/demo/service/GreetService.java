package com.rupine.demo.service;

import java.util.Random;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GreetService {

	public String greetService() {
		Random rand = new Random(); 
		  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(100); 
        if (rand_int1>50) {
        	return ("good morning");
        }
        else {
        	return ("good night");
        }
	}
	public String greetService1(int rand_int1) {
		Random rand = new Random(); 
		  
        // Generate random integers in range 0 to 999 
        if (rand_int1>50) {
        	return ("good morning");
        }
        else {
        	return ("good night");
        }
	}
}
