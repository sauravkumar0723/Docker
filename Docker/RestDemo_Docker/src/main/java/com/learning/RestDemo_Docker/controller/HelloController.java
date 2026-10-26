package com.learning.RestDemo_Docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String greet()
	{
		return "Hello, saurav this is Docker learning Project";
	}

}
