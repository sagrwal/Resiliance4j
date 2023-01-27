package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User services is talking longer than Expectation.."+
	"Please try again later";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String deptmentServiceFallBackMethod() {
		return "Department services is talking longer than Expectation.."+
	"Please try again later";
	}
}
