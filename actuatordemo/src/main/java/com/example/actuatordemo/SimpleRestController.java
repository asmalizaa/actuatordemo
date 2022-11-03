package com.example.actuatordemo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

	@GetMapping("/example")
	public String example() {
		return "Hello User!!! " + LocalDateTime.now();
	}
	
	@GetMapping("/add")
	public int add(int a, int b) {
		return a + b;
	}
}
