package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class RoleController {

	@RequestMapping("/role")
    List<String> user() {
		List<String> list = new ArrayList<String>();
		list.add("Hello World role!");
		list.add("Spring boot role!");
        return list;
    }
	
}
