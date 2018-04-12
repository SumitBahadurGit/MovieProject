package com.movies.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringTest {

	public String hello = "Hello, How R u?";
	
	@RequestMapping("/hello")
	public String hello(){
		
		return hello;
		
	}
}
