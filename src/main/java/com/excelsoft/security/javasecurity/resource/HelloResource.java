package com.excelsoft.security.javasecurity.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/hello")
@RestController
public class HelloResource {
	
	@GetMapping("/all")
	private String hello() {
		return "Hello";
	}
	
	@GetMapping("/secured/all")
	private String securedHello() {
		return "Secured Hello";
	}
}
