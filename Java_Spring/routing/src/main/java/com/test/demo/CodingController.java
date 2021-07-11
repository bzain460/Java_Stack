package com.test.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String hello() {
		return "Hello Coding Dojo";
	}
	@RequestMapping("/python")
	public String hello1() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/java")
	public String hello2() {
		return "java/spring is better!";
	}
}
