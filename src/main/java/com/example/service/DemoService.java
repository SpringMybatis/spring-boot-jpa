package com.example.service;

import java.util.List;

import com.example.entity.Demo;

public interface DemoService {

	public void save(Demo demo);
	
	public void delte(Long id);
	
	public List<Demo> listDemo();

	public Demo getDemo(Long id);
}
