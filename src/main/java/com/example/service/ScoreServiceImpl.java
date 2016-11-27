package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ScoreRepository;
import com.example.entity.Score;

@Service
public class ScoreServiceImpl implements ScoreService{

	@Autowired
	private ScoreRepository scoreRepository;

	@Override
	public void delete(int id) {
		scoreRepository.delete(id);
	}

	@Override
	public List<Score> getList() {
		return (List<Score>) scoreRepository.findAll();
	}
	
}
