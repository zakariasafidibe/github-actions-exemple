package com.project.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdProjectApplication.class, args);
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		
		return "Welcome ! ";
	}

}
