package com.movies.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/payment")
public class Controller {

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public String getvideo(){
		return "Hello how r u?";
		
	}
}
