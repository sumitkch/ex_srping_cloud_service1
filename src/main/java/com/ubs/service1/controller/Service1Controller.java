package com.ubs.service1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {

	@GetMapping("/first")
	public String firstRequest() {
		return "Service1 Request called";
	}
}
