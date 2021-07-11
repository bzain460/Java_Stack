package com.test.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dojo_Controller {
	@RequestMapping("/{Adam}")
	public String Adam1(@PathVariable("Adam")String Adam){
		return "Adam is great "+Adam;
		
	}
	
	@RequestMapping("/burbank-dojo/{Adam}")
	public String Adam2(@PathVariable("Adam")String Adam){
		return "Adam is genious "+Adam;
	}
	@RequestMapping("/san-Jose/{Adam}")
	public String Adam3(@PathVariable("Adam")String Adam){
		return "Adam is genious "+Adam;
	}
}
