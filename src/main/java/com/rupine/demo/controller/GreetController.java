package com.rupine.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rupine.demo.service.GreetService;

@RestController
public class GreetController {

	@Autowired
	GreetService svc;
	
	@GetMapping("/welcome")
	public String greet() {
		return svc.greetService();
	}

	@GetMapping("/welcome1/{id}")
	public String greet1(@PathVariable ("id") int xyz) {
		
		return svc.greetService1(xyz);
	}
}

