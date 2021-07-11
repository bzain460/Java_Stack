package com.test.demo;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class DispalyDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DispalyDateApplication.class, args);
	}
	@RequestMapping("/")
	public String show() {
		return "index.jsp";
		
	
	

}
	@RequestMapping ("/Date")
		public String Date() {
			return "Date.jsp";
		}
	
		
	}

