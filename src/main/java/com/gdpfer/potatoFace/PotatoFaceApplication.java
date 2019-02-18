package com.gdpfer.potatoFace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PotatoFaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PotatoFaceApplication.class, args);
	}
	
	@GetMapping("/")
	  public String hello() {
	    return "hello world!";
	  }

}
