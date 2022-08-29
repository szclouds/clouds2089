package com.clouds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Clouds2089Application {

	public static void main(String[] args) {
		SpringApplication.run(Clouds2089Application.class, args);
	}
	@GetMapping("/test")
	public String testGet(){
		return "hello world";
	}

}
