package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller1 {
	
	@RequestMapping(value="/hi",method=RequestMethod.GET)
	public String home() {
		return "hello sahithi&madhuri";
	}


}
