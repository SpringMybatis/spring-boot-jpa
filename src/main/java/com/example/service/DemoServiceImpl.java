package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DemoDAO;
import com.example.dao.DemoRepository;
import com.example.entity.Demo;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
    private DemoRepository demoRepository;
	
	@Autowired
	private DemoDAO demoDAO;

	@Override
	public void save(Demo demo) {
		demoRepository.save(demo);
	}

	@Override
	public void delte(Long id) {
		demoRepository.delete(id);
	}

	@Override
	public List<Demo> listDemo() {
		return (List<Demo>) demoRepository.findAll();
	}

	@Override
	public Demo getDemo(Long id) {
		return demoDAO.getDemoById(id);
	}
	
}
