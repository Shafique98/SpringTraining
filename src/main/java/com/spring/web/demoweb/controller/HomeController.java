package com.spring.web.demoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping
	public String greet() {
		return "Welcome to Demo Web.";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "I am about.";
	}
	
}
