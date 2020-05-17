package com.ibm.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyspringbootController {
	
	@GetMapping
	public String getHello( ) {
		return "Hello Spring-Boot!!!";
	}

}
