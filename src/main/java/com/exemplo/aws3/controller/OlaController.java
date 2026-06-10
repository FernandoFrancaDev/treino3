package com.exemplo.aws3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {
	
	@GetMapping("/health")
	public String dizerOla() {
		return "UP!";
	}

}
