package com.example.webservice2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;2
@RestController
public class WebService2 {
	@GetMapping("/")
	public String sayHello(){
	return "Hello !";
	}
}
