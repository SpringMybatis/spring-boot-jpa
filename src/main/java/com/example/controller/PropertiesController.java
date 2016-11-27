package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.MyProperties;

@RestController
@RequestMapping("/pp")
public class PropertiesController {

	@Autowired
	private MyProperties myProperties;
	
	@RequestMapping("/test")
	public @ResponseBody String test() {
		System.out.println(myProperties.getName());
		System.out.println(myProperties.getValue());
		return "ok";
	}

}
