package com.test.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Human {
	@RequestMapping("//your_server/?name=")
	public String human (@RequestParam(value="name", required=false) String name) {
		if (name!=null)
			return String.format("<h1>Hello Human!<h1>", name);
			return name;	
	}
}