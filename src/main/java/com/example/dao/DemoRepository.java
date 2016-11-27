package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Demo;

public interface DemoRepository extends CrudRepository<Demo, Long>{

	
}
