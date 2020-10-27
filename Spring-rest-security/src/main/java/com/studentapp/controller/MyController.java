package com.studentapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/user/show")
	public String showMessage() {
		return "hi";
	}
	@GetMapping("/user/greet")
	public String greet() {
		return "hello";
	}
	@GetMapping("/edit")
	public String editProduct() {
		return "edited";
	}
	@GetMapping("/add")
	public String addProduct() {
		return "added";
	}

}
