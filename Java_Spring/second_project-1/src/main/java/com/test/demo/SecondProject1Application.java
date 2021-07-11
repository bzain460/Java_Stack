package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SecondProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SecondProject1Application.class, args);
	}
	
	
    @RequestMapping("/")
    public String hello() { 
           return "Hello Client! How are you doing?";
    }

    @RequestMapping("/random")
    public String helloSpring() { 
           return "springboot is great!so easy to just respond with strings!";
    }

}
