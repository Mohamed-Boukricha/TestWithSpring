package com.ITMinds.TestWithSpring;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String greet() {
		return "Hello, World";
	}
}