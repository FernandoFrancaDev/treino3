package com.exemplo.aws3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {
	
	@GetMapping("/teste")
	public String dizerOla() {
		return "Aula5 - Docker";
	}

}
